package com.davideleonino.gestione_prodotti_Spring.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProdottoService {

    private  final PrezzoService prezzoService;

    private final List<String> prodotti = new ArrayList<>();
    private final Map<String, Double> prezzi = new HashMap<>();


    //prima casistica di inizione dipendenza da documentazione (la solita)
    public ProdottoService(PrezzoService prezzoService) {
        this.prezzoService = prezzoService;
    }

    @PostConstruct
    public void inizializzaProdotti() {

        prodotti.add("Letto singolo");
        prodotti.add("letto 1piazza/2");
        prodotti.add("letto matrimoniale");

        prezzi.put("Letto singolo", 100.0);
        prezzi.put("letto 1piazza/2", 140.0);
        prezzi.put("letto matrimoniale", 190.0);
    }

    public void stampaCatalogo(int percentualeSconto) {

        System.out.println("===== CATALOGO PRODOTTI =====");

        for (String prodotto : prodotti) {

            double prezzoOriginale = prezzi.get(prodotto);

            double prezzoScontato = prezzoService.calcolaPrezzoScontato(
                    prezzoOriginale, percentualeSconto
            );

            System.out.printf(
                    "%s - Prezzo originale: %.2f € - Prezzo scontato: %.2f €%n",
                    prodotto, prezzoOriginale, prezzoScontato
            );
        }
    }


}
