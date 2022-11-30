package com.adriano.lista.encadeada;

public class Lista<T> {

    private No<T> refNoEntrada;

    public Lista() {
        this.refNoEntrada = null;
    }

    public boolean isEmpty() {
        return this.refNoEntrada == null ? true : false;
    }

    public int size() {
        int tamanho = 0;
        if (this.refNoEntrada != null) {
            No<T> aux = this.refNoEntrada;
            while (aux != null) {
                tamanho++;
                aux = aux.getProximoNo();
            }
        }

        return tamanho;
    }

    public void add(T conteudo) {
        No<T> no = new No(conteudo);
        if (this.refNoEntrada == null) {
            this.refNoEntrada = no;
        } else {
            No<T> aux = this.refNoEntrada;
            for (int i = 0; i < this.size()-1; i++) {
                    aux = aux.getProximoNo();
            }
            aux.setProximoNo(no);
        }
    }

    public void add(T conteudo, int posicao) {
        int tamanho = this.size();
        if (posicao > tamanho) {
            System.out.println("Posicao invalida");;
        } else {
            No<T> no = new No(conteudo);
            No<T> aux = this.refNoEntrada;
            for (int i = 0; i < posicao-1; i++) {
                aux = aux.getProximoNo();
            }
            if(aux == null){
                this.refNoEntrada = no;
            } else{
                if(posicao == 0){
                 this.refNoEntrada = no;
                 no.setProximoNo(aux);
                } else {
                    no.setProximoNo(aux.getProximoNo());
                    aux.setProximoNo(no);
                }
            }
        }
    }
    private void validaIndice(int index){
        if(index >= this.size()){
            throw new IndexOutOfBoundsException("Não existe conteudo no indice:"+index+ "nesta lista. Esta lista vai ate o indice:"+(this.size()-1));
        }
    }

    private No<T> getNo(int index){/////////////////
        this.validaIndice(index);
        No<T> auxiliar = this.refNoEntrada;
        //No<T> noRetorno = null;

        for (int i = 0; i < index; i++) {
            //noRetorno = auxiliar;
            auxiliar = auxiliar.getProximoNo();
        }

        return auxiliar;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noPivor= this.getNo(index);
        if(index == 0){
            this.refNoEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.refNoEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
