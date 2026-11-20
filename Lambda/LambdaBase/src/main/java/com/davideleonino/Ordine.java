package com.davideleonino;

public record Ordine(
        String cliente,
        String prodotto,
        int quantita,
        double prezzoUnitario
) {

    public double totale() {
        return quantita * prezzoUnitario;
    }
}
