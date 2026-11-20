package com.davideleonino;

public class Programmatore extends Dipendente {

    private String linguaggioPrincipale;

    public Programmatore(String nome, String id, double stipendioBase, String linguaggioPrincipale) {
        super(nome, id, stipendioBase);
        this.linguaggioPrincipale = linguaggioPrincipale;
    }

    public String getLinguaggioPrincipale() {
        return linguaggioPrincipale;
    }

    public void setLinguaggioPrincipale(String linguaggioPrincipale) {
        this.linguaggioPrincipale = linguaggioPrincipale;
    }

    @Override
    public double calcolaStipendio() {
        return getStipendioBase() + 200;
    }
}
