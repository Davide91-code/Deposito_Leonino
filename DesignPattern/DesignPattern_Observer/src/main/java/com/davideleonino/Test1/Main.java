package com.davideleonino.Test1;


public class Main {
    public static void main(String[] args) {

        Termometro termometro = new Termometro();

        // Osservatore 1: ventilatore

        termometro.iscrivi(t -> {
            if (t > 28) {
                System.out.println("Ventilatore acceso!");
            } else {
                System.out.println("Ventilatore spento.");
            }
        });

        // Osservatore 2: display

        termometro.iscrivi(t ->
                System.out.println("Temperatura: " + t + "°C")
        );

        termometro.registra(25);
        termometro.registra(29);
        termometro.registra(27);

    }
}