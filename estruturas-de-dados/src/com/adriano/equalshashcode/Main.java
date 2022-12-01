package com.adriano.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Fiat"));
        carros.add(new Carro("BMW"));
        carros.add(new Carro("Land Rover"));
        carros.add(new Carro("Ford"));

        System.out.println(carros.contains(new Carro("BMW"))); // vai ser utilizado  o metodo equals da classe para verificar se a lista o  contem

        System.out.println(new Carro("Fiat").hashCode());
        System.out.println(new Carro("fiat").hashCode());

        Carro carro1 = new Carro("Volkswagem");
        Carro carro2 = new Carro("Volkswagem");
        System.out.println(carro1.equals(carro2));

        carro2.setMarca("volkswagem");
        System.out.println(carro1.equals(carro2));


    }
}
