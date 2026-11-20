package com.davideleonino;

public class CaneLibero extends Cane {

    private double spazioCorsaMq;

    public CaneLibero(String nome, int età, double peso, double spazioCorsaMq) {
        super(peso, età, nome);
        this.spazioCorsaMq = spazioCorsaMq;
    }

    public double getSpazioCorsaMq() {
        return spazioCorsaMq;
    }

    public void setSpazioCorsaMq(double spazioCorsaMq) {
        this.spazioCorsaMq = spazioCorsaMq;
    }

    @Override
    public String muoviti() {
        return "Il cane " + getNome()
                + " corre felice nel parco occupando "
                + spazioCorsaMq + " mq!";
    }

    @Override
    public String verso() {
        return  "Il cane " + getNome()
                + " abbaia di giogia!";

    }
}
