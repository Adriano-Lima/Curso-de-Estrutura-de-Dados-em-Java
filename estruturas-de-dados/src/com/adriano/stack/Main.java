package com.adriano.stack;

import com.adriano.equalshashcode.Carro;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Pilha,LIFO, ulitmo a entrar é o primeiro a sair
        Stack<Carro> stackcarros = new Stack<>();
        stackcarros.push(new Carro("Ford"));
        stackcarros.push(new Carro("Fiat"));
        stackcarros.push(new Carro("Chevrolet"));

        System.out.println(stackcarros);
        System.out.println(stackcarros.pop()); // removendo o topo da pilha
        System.out.println(stackcarros);

        System.out.println(stackcarros.peek()); // mostra o topo da pilha
        System.out.println(stackcarros);

        System.out.println(stackcarros.empty());
    }
}
