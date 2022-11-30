package com.adriano.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = this.ultimoNo = null;
    }

    public int size() {
        return this.tamanhoLista;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> aux = this.primeiroNo;
        for (int i = 0; (i < index) && (aux != null); i++) {
            aux = aux.getProximoNo();
        }
        return aux;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(ultimoNo);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T conteudo) {
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        NoDuplo<T> noPivor = getNo(index);

        novoNo.setProximoNo(noPivor);
        if (noPivor != null) {
            novoNo.setNoAnterior(noPivor.getNoAnterior());
            noPivor.setNoAnterior(novoNo);
        } else { //se a lista estiver vazia, ou posicao alem do indice que ja existe na lista
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoAnterior().setProximoNo(novoNo);
        }
        tamanhoLista++;
    }

    public T remove(int index) {
        NoDuplo<T> aux = getNo(index);
        if (index == 0) {
            primeiroNo = primeiroNo.getProximoNo();
            if (primeiroNo != null) {
                primeiroNo.setNoAnterior(null);
            }
        } else {
            aux.getNoAnterior().setProximoNo(aux.getProximoNo());
            if (aux != ultimoNo) {
                aux.getProximoNo().setNoAnterior(aux.getNoAnterior());
            } else {
                ultimoNo = aux;
            }
        }
        tamanhoLista--;
        return aux.getConteudo();
    }


    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = this.primeiroNo;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
