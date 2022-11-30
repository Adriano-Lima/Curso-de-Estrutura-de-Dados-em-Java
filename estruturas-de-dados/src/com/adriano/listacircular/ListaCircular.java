package com.adriano.listacircular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = this.cauda = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return (tamanhoLista == 0) ? true : false;
    }

    private No<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista esta vazia");
        }
        if(index == 0){
            return cauda;
        } else{
            No<T> aux = cauda;
            for(int i=0;(i<index)&&(aux!=null);i++){
                aux = aux.getProximoNo();
            }
            return aux;
        }
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        if(index >= this.tamanhoLista){
            throw new IndexOutOfBoundsException("O indice e maior que o tamanho da lista.");
        }
        No<T> aux = this.cauda;
        T conteudo;
        if(index == 0){
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
            conteudo = this.cabeca.getProximoNo().getConteudo();
        }else if(index == 1){
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
            conteudo = this.cauda.getProximoNo().getConteudo();
        } else{
            for(int i=0;i<index-1;i++){
                aux = aux.getProximoNo();
            }
            aux.setProximoNo(aux.getProximoNo().getProximoNo());
            conteudo = aux.getProximoNo().getConteudo();
        }
        this.tamanhoLista--;
        return conteudo;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.tamanhoLista == 0){
            this.cauda = this.cabeca = novoNo;
            this.cabeca.setProximoNo(this.cauda);
        } else{
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    @Override
    public String toString() {
        String strRtorno ="";
        No<T> aux = this.cauda;
        for (int i=0;i<this.tamanhoLista;i++){
            strRtorno += "[No{conteudo="+aux.getConteudo()+"}]--->";
            aux = aux.getProximoNo();
        }

        strRtorno += this.tamanhoLista !=0 ? "[No{conteudo="+cabeca.getProximoNo().getConteudo()+"}]":"[]";


        return strRtorno;
    }
}
