package com.adriano.list;

import com.adriano.equalshashcode.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarros=  new ArrayList<>();
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Tesla"));

        System.out.println(listCarros.contains(new Carro("Chevrolet")));

        System.out.println("Carro no indice 2 >: "+listCarros.get(2));

        System.out.println("Indice de Tesla >: "+listCarros.indexOf(new Carro("Tesla")));

        System.out.println(listCarros.remove(1));
        System.out.println(listCarros);
    }
}
