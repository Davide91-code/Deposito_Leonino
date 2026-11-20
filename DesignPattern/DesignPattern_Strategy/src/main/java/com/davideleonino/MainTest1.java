package com.davideleonino;


public class MainTest1 {
    public static void main(String[] args) {

        //creiamo una strategia che ci permette di implementare data scelta al bisogno
        TariffaParcheggio strategia = new TariffaOraria();

        System.out.println(strategia.calcolaCosto(5));

        //non abbiamo bisogno di creare una nuova strategia come sopra:
        // stiamo utilizzando sempre la stessa ma con una nuova implementazione
        strategia = new TariffaGiornaliera();

        System.out.println(strategia.calcolaCosto(5));


    }
}