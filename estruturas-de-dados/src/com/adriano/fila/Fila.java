package com.adriano.fila;

public class Fila<T> {
    private No<T> refNoPrimeiroFila;

    public Fila() {
        this.refNoPrimeiroFila = null;
    }

    public boolean isEmpty() {
        return this.refNoPrimeiroFila == null ? true : false;
    }

    public T first() {
        if(refNoPrimeiroFila != null) {
            return refNoPrimeiroFila.getObject();
        } else{
            return null;
        }
    }

    public void enqueue(T obj) {
        No<T> no = new No(obj);
        if (!this.isEmpty()) {
            No aux = this.refNoPrimeiroFila;
            while (aux.getRefNo() != null) {
                aux = aux.getRefNo();
            }
            aux.setRefNo(no);
        } else {
            this.refNoPrimeiroFila = no;
        }
    }

    public T dequeue() {
        No aux = this.refNoPrimeiroFila;
        this.refNoPrimeiroFila = this.refNoPrimeiroFila.getRefNo();
        return (T) aux.getObject();
    }

    @Override
    public String toString() {
        String stringRetorno = "-------------------\n";
        stringRetorno += "        Filha\n";

        No aux = this.refNoPrimeiroFila;
        while (aux != null) {
            stringRetorno += aux.getObject().toString() + "\n";
            aux = aux.getRefNo();
        }

        stringRetorno += "-------------------";

        return stringRetorno;
    }
}

