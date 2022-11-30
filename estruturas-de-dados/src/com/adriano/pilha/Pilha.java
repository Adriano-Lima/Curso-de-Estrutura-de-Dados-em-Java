package com.adriano.pilha;

public class Pilha {
    private No refNoTopoPilha;

    public Pilha(){
        this.refNoTopoPilha = null;
    }

    public Pilha(No refNoTopoPilha) {
        this.refNoTopoPilha = refNoTopoPilha;
    }

    public boolean isEmpty(){ //verificar se a pilha esta vazia
        return refNoTopoPilha==null? true:false;
    }

    public No top(){ //pegar ref. do no que esta no topo da pilha
        return refNoTopoPilha;
    }

    public void push(No no){ //empilhar
        No aux = this.refNoTopoPilha;
        this.refNoTopoPilha = no;
        this.refNoTopoPilha.setRefNo(aux);
    }

    public No pop(){ //pegar no que esta no topo da pilha, desempilhar
        if(!this.isEmpty()){
            No noPoped = this.refNoTopoPilha;
            this.refNoTopoPilha = this.refNoTopoPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-------------------\n";
        stringRetorno += "        Pilha\n";

        No aux = this.refNoTopoPilha;
        while (aux!= null){
            stringRetorno += aux.getDado()+"\n";
            aux = aux.getRefNo();
        }

        stringRetorno += "-------------------\n";

        return stringRetorno;
    }
}
