package com.davideleonino;

public class PrenotazioneCampoAllAperto extends Prenotazione {

    private boolean richiedeNoleggioCasacche;

    public PrenotazioneCampoAllAperto(String idPrenotazione, String nomeCliente, int durataOre, double tariffaOrariaBase, boolean richiedeNoleggioCasacche) {
        super(idPrenotazione, nomeCliente, durataOre, tariffaOrariaBase);
        this.richiedeNoleggioCasacche = richiedeNoleggioCasacche;
    }

    @Override
    public double calcolaCostoTotale() {
        double costo = getDurataOre() * getTariffaOrariaBase();

        if (richiedeNoleggioCasacche)
            costo = (getDurataOre() * 1.50);
        return costo;

    }


    @Override
    public String ottieniRiepilogo() {
        return super.ottieniRiepilogo()
                + "\nTipo campo: All'aperto"
                + "\nNoleggio casacche: " + richiedeNoleggioCasacche;
    }


}
