package com.davideleonino;

import java.util.List;

public class MainTest2 {

    public static void main(String[] args) {

        String testo = "Hello World ! ";

        List<Formattazione> strategie = List.of(
                new Maiuscolo(),
                new InizialeMaiuscola(),
                new Inverso()
        );

        for (Formattazione strategia : strategie) {

            testo = strategia.applica(testo);

            System.out.println(testo);
        }
    }




    }

