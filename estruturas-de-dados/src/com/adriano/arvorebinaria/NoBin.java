package com.adriano.arvorebinaria;

import java.util.Comparator;

public class NoBin<T extends Comparable<T>>  {
    private T conteudo;
    private NoBin<T> noEsq;
    private NoBin<T> noDir;

    public NoBin(T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = this.noDir = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoBin<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(NoBin<T> noEsq) {
        this.noEsq = noEsq;
    }

    public NoBin<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(NoBin<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "NoBin{" +
                "conteudo=" + conteudo +
                '}';
    }
}
