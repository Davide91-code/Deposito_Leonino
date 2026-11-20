package com.davideleonino;


public class MainTest2 {

    public static void main(String[] args) {

        Distributore distributore = Distributore.INSTANCE;


        distributore.inserisci(5.0);


        System.out.println(distributore.eroga(2.0));


        System.out.println(distributore.eroga(4.0));


        System.out.println("Credito residuo: " + distributore.getCredito());
    }


}
