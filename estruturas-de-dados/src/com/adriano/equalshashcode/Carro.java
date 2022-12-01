package com.adriano.equalshashcode;

import java.util.Objects;

public class Carro implements Comparable<Carro>{
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) return true;
        if (outro == null || getClass() != outro.getClass()) return false;
        Carro outroCarro = (Carro) outro;
        return Objects.equals(marca, outroCarro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(Carro outro) {
        return this.marca.compareTo(outro.getMarca());
    }
}
