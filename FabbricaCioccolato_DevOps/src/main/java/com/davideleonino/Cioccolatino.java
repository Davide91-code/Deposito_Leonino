package com.davideleonino;

public class Cioccolatino extends Cioccolato {

    private String forma;
    private String ripieno;

    public Cioccolatino(String tipoCioccolato, double percentualeCacao,
                        String forma, String ripieno) {

        super(tipoCioccolato, percentualeCacao);

        this.forma = forma;
        this.ripieno = ripieno;
    }

    @Override
    public void produce() {

    }
}
