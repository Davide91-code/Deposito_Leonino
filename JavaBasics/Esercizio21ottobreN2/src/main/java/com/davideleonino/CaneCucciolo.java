package com.davideleonino;

public class CaneCucciolo extends Cane {

    private int livelloVivacità;

    public CaneCucciolo(String nome, String razza, int età, int livelloVivacità) {
        super(nome, razza, età);
        this.livelloVivacità = livelloVivacità;
    }


    public int getLivelloVivacità() {
        return livelloVivacità;
    }

    public void setLivelloVivacità(int livelloVivacità) {
        this.livelloVivacità = livelloVivacità;
    }

    @Override
    public String esciDallaGabbia() {
        return getNome() + " corre fuori dalla gabbia saltando dalla gioia!";
    }

}
