package com.davideleonino;

public class PrenotazioneCampoCoperto extends Prenotazione {

    private boolean riscaldamentoAttivo;

    public PrenotazioneCampoCoperto(String idPrenotazione, String nomeCliente, int durataOre, double tariffaOrariaBase, boolean riscaldamentoAttivo) {
        super(idPrenotazione, nomeCliente, durataOre, tariffaOrariaBase);
        this.riscaldamentoAttivo = riscaldamentoAttivo;
    }

    public double calcolaCostoTotale() {
        double costo = getDurataOre() * getTariffaOrariaBase();

        if (riscaldamentoAttivo) {
            costo = costo + 15;
        }

        return costo;
    }

    @Override
    public String ottieniRiepilogo() {
        return super.ottieniRiepilogo()
                + "\nTipo campo: Coperto"
                + "\nRiscaldamento attivo: " + riscaldamentoAttivo;
    }
}
