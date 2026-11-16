package com.davideleonino;



public class MainTest1 {

    public static void main(String[] args) {

        Veicolo auto = VeicoloFactory.crea("auto");
        Veicolo moto = VeicoloFactory.crea("moto");
        //Veicolo errore = VeicoloFactory.crea("triciclo");


        System.out.println("Ruote auto: " + auto.ruote());
        System.out.println("Ruote moto: " + moto.ruote());
        //System.out.println("Ruote triciclo: " + errore.ruote());


    }



}