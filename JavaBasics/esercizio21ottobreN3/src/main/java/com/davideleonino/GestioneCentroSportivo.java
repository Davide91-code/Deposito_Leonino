package com.davideleonino;

import java.util.ArrayList;

public class GestioneCentroSportivo {

    public static void main(String[] args) {

        ArrayList <Prenotazione> prenotazioni = new ArrayList<>();

        prenotazioni.add(new PrenotazioneCampoCoperto(
                "01", "Marco", 2, 30.00, true));

        prenotazioni.add(new PrenotazioneCampoCoperto(
                "02", "Luca", 1, 30.00, false));

        prenotazioni.add(new PrenotazioneCampoAllAperto(
                "03", "Andrea", 2, 25.00, true));

        prenotazioni.add(new PrenotazioneCampoAllAperto(
                "04", "Paolo", 1, 25.00, false));


        double incassoTotale = 0;

        for (Prenotazione prenotazione : prenotazioni) {

            System.out.println("------");
            System.out.println(prenotazione.ottieniRiepilogo());

            double costo = prenotazione.calcolaCostoTotale();

            System.out.println("-------");
            System.out.println("Costo totale " + costo + " euro.");
        }






    }
}
