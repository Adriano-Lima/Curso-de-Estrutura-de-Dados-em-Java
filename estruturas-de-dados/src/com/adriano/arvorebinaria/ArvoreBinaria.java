package com.adriano.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
    private NoBin<T> raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(T conteudo) {
        NoBin<T> novoNo = new NoBin<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private NoBin<T> inserir(NoBin<T> atual, NoBin<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    private void exbirInOrdem(NoBin<T> atual) {
        if (atual != null) {
            exbirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ",");
            exbirInOrdem(atual.getNoDir());
        }
    }

    public void exbirInOrdem() {
        System.out.println("\n\tExibindo In-Ordem");
        exbirInOrdem(raiz);
    }

    private void exbirPosOrdem(NoBin<T> atual) {
        if (atual != null) {
            exbirPosOrdem(atual.getNoEsq());
            exbirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ",");
        }
    }

    public void exbirPosOrdem() {
        System.out.println("\n\tExibindo Pos-Ordem");
        exbirPosOrdem(raiz);
    }

    private void exbirPreOrdem(NoBin<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ",");
            exbirPreOrdem(atual.getNoEsq());
            exbirPreOrdem(atual.getNoDir());
        }
    }

    public void exbirPreOrdem() {
        System.out.println("\n\tExibindo Pre-Ordem");
        exbirPreOrdem(raiz);
    }

    public void remover(T conteudo) {
        try {
            NoBin<T> atual = raiz;
            NoBin<T> pai = null;
            NoBin<T> filho = null;
            NoBin<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }
            if (atual == null) {
                System.out.println("Conteudo nao encontrado. Bloco try");
            }

            if (pai == null) {
                if (atual.getNoDir() == null) {
                    raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    raiz = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq(); filho.getNoDir() != null; temp = filho, filho = filho.getNoEsq()) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if (atual.getNoDir() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else {
                for (temp = atual, filho = atual.getNoEsq(); filho.getNoDir() != null; temp = filho, filho = filho.getNoDir()) {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }

            }
        } catch (NullPointerException e) {
            System.out.println("Conteudo nao encontrado. Bloco catch");
        }
    }
}
