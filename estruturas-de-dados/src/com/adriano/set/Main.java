package com.adriano.set;

import com.adriano.equalshashcode.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //conjunto de dados
        Set<Carro> setCarros = new HashSet<>();
        setCarros.add(new Carro("Ford"));
        setCarros.add(new Carro("Chevrolet"));
        setCarros.add(new Carro("Fiat"));
        setCarros.add(new Carro("Peugeot"));
        setCarros.add(new Carro("Zip"));
        setCarros.add(new Carro("Alfa Romeo"));

        System.out.println(setCarros);

        //arvore
        Set<Carro> treeSetCarros = new TreeSet<>(setCarros); //necessario implementar o Comparable

        System.out.println(treeSetCarros);
    }
}
