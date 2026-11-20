package com.davideleonino;

public class Termostato {

    // unica istanza di classe.
    private static  Termostato instance = new Termostato();


    private double temperatura = 20.0;

    // costruttore privato cosi che non lo si può replicare:
    // faremo riferimento sempre allo stesso oggetto
    private Termostato () {

    }

    // Metodo per ottenere l'istanza
    public static Termostato getInstance() {
        return instance;
    }


    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
