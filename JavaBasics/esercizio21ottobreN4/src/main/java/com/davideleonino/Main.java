package com.davideleonino;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Dipendente> dipendenti = new ArrayList<>();

        Programmatore programmatore =
                new Programmatore("Elena", "P01", 1800, "Java");

        Manager manager =
                new Manager("Valentina", "M01", 4500, 700);

        dipendenti.add(programmatore);
        dipendenti.add(manager);

        manager.assegnaProgetto("Gestionale aziendale");
        manager.assegnaProgetto("Sito web", "Alta");


        for (Dipendente dipendente : dipendenti) {
            System.out.println("Nome: " + dipendente.getNome());
            System.out.println("Stipendio: " + dipendente.calcolaStipendio() + " euro");
            System.out.println("--------------------");
        }

        manager.riceviPromozione();

        System.out.println("Nuovo stipendio manager: "
                + manager.calcolaStipendio() + " euro");

        System.out.println("Progetti gestiti:");

        for (String progetto : manager.getProgettiGestiti()) {
            System.out.println(progetto);
        }







    }

}