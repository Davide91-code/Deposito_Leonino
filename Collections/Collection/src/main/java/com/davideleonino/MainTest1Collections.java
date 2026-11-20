package com.davideleonino;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTest1Collections {
    public static void main(String[] args) {

        double[] temperature = {12.5, 15.0, 9.8, 18.2, 14.0, 11.3, 16.7};

        String[] giorni = {"Lunedì", "Martedì", "Mercoledì", "Giovedì",
                "Venerdì", "Sabato", "Domenica"};

        double temperaturaMax = temperature[0];
        int giornoMax = 0;


        for (int i = 1; i < temperature.length; i++) {

            if (temperature[i] > temperaturaMax) {
                temperaturaMax = temperature[i];
                giornoMax = i;
            }
        }

        System.out.println("Temperatura massima: " + temperaturaMax);
        System.out.println("Giorno: " + giorni[giornoMax]);


    }
}