package com.davideleonino;

public abstract class Dipendente {

    private String nome;
    private String id;
    private double stipendioBase;

    public Dipendente(String nome, String id, double stipendioBase) {
        this.nome = nome;
        this.id = id;
        this.stipendioBase = stipendioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public void setStipendioBase(double stipendioBase) {
        if (stipendioBase >= 0) {
            this.stipendioBase = stipendioBase;
        } else {
            System.out.println("Errore: la cifra non può essere negativa");
        }

    }

    public abstract double calcolaStipendio();



}
