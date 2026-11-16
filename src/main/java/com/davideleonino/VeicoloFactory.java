package com.davideleonino;

public class VeicoloFactory {

    //la factory si occupa di centralizzare la logica di creazione.
    // Quindi crea l oggetto e nello switch decide quale oggetto restituire

    public  static Veicolo crea (String tipo) {

        return switch (tipo) {

            case "moto" -> new Moto();
            case "auto" -> new Auto();
            default -> throw new IllegalArgumentException("mezzo sconosciuto: " + tipo);


        };

    }
}
