package com.davideleonino;


import java.util.Comparator;
import java.util.List;

public class MainTest3 {

    public static void main(String[] args) {

        List<Ordine> ordini = List.of(
                new Ordine("Anna", "Mouse", 2, 25.0),
                new Ordine("Luca", "Monitor", 1, 199.0),
                new Ordine("Anna", "Tastiera", 1, 45.0),
                new Ordine("Marta", "Mouse", 3, 25.0),
                new Ordine("Luca", "Webcam", 2, 60.0),
                new Ordine("Paolo", "Monitor", 2, 199.0)
        );

        //estraiamo il nome dal prodotto grazie ad ordini.
        // con distinct eliminiamo i duplicati e con sorted li ordiniamo alfabeticamente

        List<String> prodotti = ordini.stream()
                .map(Ordine::prodotto)
                .distinct()
                .sorted()
                .toList();

        System.out.println("Prodotti: " + prodotti);

        //con maptoDouble trasformiamon gli elementi in valori numerici double

        double totaleIncassato = ordini.stream()
                .mapToDouble(Ordine::totale)
                .sum();

        System.out.println("Totale incassato: " + totaleIncassato);

        // in filter poniamo una condizione:
        // se il valore supera 100, quindi è vera, verrà mantenuta in lista,
        // altrimenti verrà eliminata
        // ordine :: cliente trasforma l oggetto in stringa permettendoci di lavorare sul nome.

        List<String> clienti = ordini.stream()
                .filter(ordine -> ordine.totale() > 100)
                .map(Ordine::cliente)
                .distinct()
                .sorted()
                .toList();

        System.out.println("Clienti: " + clienti);

        //


        String ordineMassimo = ordini.stream()
                .max(Comparator.comparingDouble(Ordine::totale))
                .map(ordine -> ordine.cliente() + " - " + ordine.prodotto())
                .orElse("Nessun ordine");

        System.out.println("Ordine massimo: " + ordineMassimo);


















    }
}