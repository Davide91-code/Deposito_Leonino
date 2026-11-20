package com.davideleonino;

public class CaneAnziano extends Cane {

    private boolean bisognoDiRiposo;

    public CaneAnziano(String nome, String razza, int età, boolean bisognoDiRiposo) {
        super(nome, razza, età);
        this.bisognoDiRiposo = bisognoDiRiposo;
    }

    @Override
    public String esciDallaGabbia() {
        return getNome() + " esce dalla gabbia molto lentamente e si sdraia al sole.";
    }
}
