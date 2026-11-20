package com.davideleonino;

public abstract class Cane {

    private String nome;
    private String razza;
    private int età;

    public Cane(String nome, String razza, int età) {
        this.nome = nome;
        this.razza = razza;
        this.età = età;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public String esciDallaGabbia (){
        return  nome + " esce dalla gabbia camminando!";
    }
}
