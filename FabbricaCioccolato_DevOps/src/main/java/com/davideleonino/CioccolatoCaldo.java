package com.davideleonino;

public class CioccolatoCaldo extends Cioccolato {

    private double temperatura;
    private double densita;

    public CioccolatoCaldo(String tipoCioccolato, double percentualeCacao,
                           double temperatura, double densita) {

        super(tipoCioccolato, percentualeCacao);

        this.temperatura = temperatura;
        this.densita = densita;
    }

    @Override
    public void produce() {

    }
}
