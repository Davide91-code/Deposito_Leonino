package com.davideleonino;

public abstract class Prenotazione {

    private String idPrenotazione;
    private String nomeCliente;
    private int durataOre;
    private double tariffaOrariaBase;

    public Prenotazione(String idPrenotazione, String nomeCliente, int durataOre, double tariffaOrariaBase) {
        this.idPrenotazione = idPrenotazione;
        this.nomeCliente = nomeCliente;
        this.durataOre = durataOre;
        this.tariffaOrariaBase = tariffaOrariaBase;
    }

    public String getIdPrenotazione() {
        return idPrenotazione;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getDurataOre() {
        return durataOre;
    }

    public double getTariffaOrariaBase() {
        return tariffaOrariaBase;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setDurataOre(int durataOre) {
        if (durataOre >= 1 ) {
        this.durataOre = durataOre;
        } else {
            System.out.println("La durata deve essere almeno di 1 ora.");
        }
    }

    public abstract double calcolaCostoTotale();

    public String ottieniRiepilogo() {
        return "ID prenotazione: " + idPrenotazione
                + "\nCliente: " + nomeCliente
                + "\nDurata: " + durataOre + " ore";
    }

}
