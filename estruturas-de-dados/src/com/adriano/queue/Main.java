package com.adriano.queue;

import com.adriano.equalshashcode.Carro;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Fila, FIFO, primeiro a entrar é o primeiro a sair
        Queue<Carro> queuecarros = new LinkedList<>();
        queuecarros.add(new Carro("Ford"));
        queuecarros.add(new Carro("Chevrolet"));
        queuecarros.add(new Carro("BMW"));

        System.out.println(queuecarros);
        System.out.println(queuecarros.offer(new Carro("Fiat"))); //tenta adicionar um novo elemento, se nao conseguir retorna false, o add se nao conseguisse geraria um erro
        System.out.println(queuecarros);

        System.out.println(queuecarros.peek()); //pega o primeiro elemento da fila
        System.out.println(queuecarros);

        System.out.println(queuecarros.poll()); //remove o primeiro elemento da fila
        System.out.println(queuecarros);

        System.out.println(queuecarros.isEmpty());

    }
}
