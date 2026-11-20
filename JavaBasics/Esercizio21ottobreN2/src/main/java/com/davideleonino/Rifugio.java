package com.davideleonino;

public class Rifugio {

    public static void main(String[] args) {

        Cane[] cani = new Cane[4];

        cani[0] = new CaneCucciolo("Pluto", "Labrador", 1, 5);
        cani[1] = new CaneAnziano("Ciccio", "Volpino", 12, true);
        cani[2] = new CaneCucciolo("Luna", "Mastino", 2, 4);
        cani[3] = new CaneAnziano("Lenu", "Dalmata", 10, false);


        for (int i = 0; i < cani.length; i++ ) {
            System.out.println(cani[i].esciDallaGabbia());
        }

    }


}
