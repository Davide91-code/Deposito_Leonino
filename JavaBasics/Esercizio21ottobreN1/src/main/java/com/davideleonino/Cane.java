package com.davideleonino;

public abstract class Cane {

    private String nome;
    private int età;
    private double peso;

    public Cane(double peso, int età, String nome) {
        this.peso = peso;
        this.età = età;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEtà() {
        return età;
    }

    public void setEta(int eta) {
        if (eta >= 0) {
            this.età = eta;
        } else {
            System.out.println("Errore: l'età non può essere negativa.");
        }
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (età >= 0) {
            this.peso = peso;
        } else {
            System.out.println("Errore: Il peso non può essere negativo");
        }

    }

    public String verso () {
        return "Il cane abbaia";
    }

    public String  muoviti () {
        return   "il cane cammina nel canile";
    }

}
