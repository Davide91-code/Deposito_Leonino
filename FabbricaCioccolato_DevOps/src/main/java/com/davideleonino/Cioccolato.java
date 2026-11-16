package com.davideleonino;

public class Cioccolato {

    private String tipoCioccolato;
    private double percentualeCacao;

    // è un limite di fabbrica o una caratteristica del singolo
    // cioccolato che andiamo a replicare? nel caso ci torno

    public static final int MAX_PRODUZIONE = 100;

    public Cioccolato(String tipoCioccolato, double percentualeCacao) {
        this.tipoCioccolato = tipoCioccolato;
        this.percentualeCacao = percentualeCacao;
    }

    public void produce() {

    }
}
