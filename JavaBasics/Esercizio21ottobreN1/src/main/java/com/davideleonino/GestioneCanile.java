
package com.davideleonino;

public class GestioneCanile {

    public static void main(String[] args) {

        Cane[] cani = new Cane[4];

        cani[0] = new CaneGabbia("Pluto", - 4, 16.6, 1);
        cani[1] = new CaneLibero("Ciccio", 4, 19.6, 25.0);
        cani[2] = new CaneGabbia("Pongo", 4, 16.6, 3);
        cani[3] = new CaneGabbia("Lila", 4, 16.6, 4);

        double spazioTotale = 0;
        int caniInGabbia = 0;

        for (Cane cane : cani) {

            System.out.println("Nome: " + cane.getNome());
            System.out.println("Età: " + cane.getEtà());
            System.out.println("Peso: " + cane.getPeso() + " kg");

            System.out.println(cane.verso());
            System.out.println(cane.muoviti());

            if (cane instanceof CaneLibero) {
                CaneLibero caneLibero = (CaneLibero) cane;
                spazioTotale += caneLibero.getSpazioCorsaMq();

            } else if (cane instanceof CaneGabbia) {
                caniInGabbia++;
            }

            System.out.println("  ");
        }

        System.out.println("Spazio totale richiesto dai cani liberi: "
                + spazioTotale + " mq");

        System.out.println("Numero di cani ancora in gabbia: "
                + caniInGabbia);
    }
}
