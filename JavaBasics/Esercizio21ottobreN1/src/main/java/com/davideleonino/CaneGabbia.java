package com.davideleonino;

public class CaneGabbia extends Cane {

    private int numeroGabbia;

    public CaneGabbia(String nome, int età, double peso, int numeroGabbia) {
        super(peso, età, nome);
        this.numeroGabbia = numeroGabbia;
    }

    public int getNumeroGabbia() {
        return numeroGabbia;
    }

    public void setNumeroGabbia(int numeroGabbia) {
        this.numeroGabbia = numeroGabbia;
    }

    @Override
    public String muoviti (){
        return "Il cane " + getNome()
                + " fa avanti e indietro nella gabbia numero "
                + numeroGabbia;
    }


}
