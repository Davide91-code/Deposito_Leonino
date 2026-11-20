package com.davideleonino;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainTest3Collections {

    public static void main(String[] args) {



        // TreeMap: ordina automaticamente le chiavi in ordine alfabetico.

        Map<String, Double> incassiAlfabetici = new TreeMap<>();

        // LinkedHashMap: mantiene l'ordine in cui vengono inserite le chiavi.

        Map<String, Double> incassiInserimento = new LinkedHashMap<>();


        String[] film = {"Quei bravi ragazzi", "Chi ha incastrato Roger Rabbit", "Boris", "Jurassic Park"};
        double[] incassi = {4500.0, 2300.0, 5800.0, 9000.0};

        for (int i = 0; i < film.length; i++) {
            incassiAlfabetici.put(film[i], incassi[i]);
            incassiInserimento.put(film[i], incassi[i]);
        }

        System.out.println("Incassi in ordine alfabetico: " + incassiAlfabetici);

        System.out.println("  ");

        System.out.println("Incassi in ordine di inserimento: " + incassiInserimento);

    }

}







