package com.adriano.fila;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        System.out.println("Primeiro no >: " + minhaFila.first());
        System.out.println(minhaFila);

        System.out.println("Dequeue >:" + minhaFila.dequeue());
        System.out.println(minhaFila);
        System.out.println("Primeiro no:> " + minhaFila.first());

        minhaFila.enqueue("quarto");
        System.out.println(minhaFila);


    }
}
