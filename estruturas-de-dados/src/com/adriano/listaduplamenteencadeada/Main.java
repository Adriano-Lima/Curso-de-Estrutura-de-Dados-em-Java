package com.adriano.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista =  new ListaDuplamenteEncadeada<>();
        //System.out.println(minhaLista.get(1));// se a lista estiver vazia
        minhaLista.add("teste 1");
        minhaLista.add("teste 2");
        System.out.println(minhaLista);

        minhaLista.add(0,"teste 3");
        System.out.println(minhaLista);

        System.out.println(minhaLista.remove(1));
        System.out.println(minhaLista);

    }
}
