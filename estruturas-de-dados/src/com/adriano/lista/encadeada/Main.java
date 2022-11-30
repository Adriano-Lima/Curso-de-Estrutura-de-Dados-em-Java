package com.adriano.lista.encadeada;

public class Main {
    public static void main(String[] args) {
        Lista<String> minhaLista = new Lista<>();
        minhaLista.add("conteudo 1");
        minhaLista.add("conteudo 2");
        minhaLista.add("conteudo 3");

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(2));

        System.out.println(minhaLista);

        System.out.println(minhaLista.remove(2));
        System.out.println(minhaLista);




    }
}
