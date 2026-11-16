package com.davideleonino;

public class Tavoletta extends Cioccolato {

    private double peso;
    private boolean contieneAggiunte; // se contiene (true) o meno aggiunte

    public Tavoletta(String tipoCioccolato, double percentualeCacao,
                     double peso, boolean contieneAggiunte) {

        super(tipoCioccolato, percentualeCacao);

        this.peso = peso;
        this.contieneAggiunte = contieneAggiunte;
    }

    @Override
    public void produce() {

    }
}
