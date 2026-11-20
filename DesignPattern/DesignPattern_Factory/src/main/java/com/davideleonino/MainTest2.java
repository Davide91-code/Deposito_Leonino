package com.davideleonino;

import java.util.Optional;

public class MainTest2 {
    public static void main(String[] args) {

         // il comando non riconosciuto è riferito sempre al tipo specificao nella factory

        Optional<Comando> comando = ComandoFactory.crea("sotma");

        if (comando.isPresent()) {

            String risultato = comando.get().esegui(5,5);

            System.out.println("Risultato operazione : " + risultato);

        } else {

            System.out.println("Comando non riconosciutto");
        }

    }

}