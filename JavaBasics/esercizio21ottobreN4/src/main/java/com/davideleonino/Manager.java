package com.davideleonino;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Dipendente implements Promuovibile{

    private double bonusProgetto;
    private List<String> progettiGestiti;


    public Manager(String nome, String id, double stipendioBase, double bonusProgetto) {

        super(nome, id, stipendioBase);
        this.bonusProgetto = bonusProgetto;
        this.progettiGestiti = new ArrayList<>();
    }

    public double getBonusProgetto() {
        return bonusProgetto;
    }

    public void setBonusProgetto(double bonusProgetto) {
        this.bonusProgetto = bonusProgetto;
    }

    @Override
    public double calcolaStipendio() {
        return getStipendioBase() + bonusProgetto;
    }

    public List<String> getProgettiGestiti() {
        return progettiGestiti;
    }

    public void assegnaProgetto(String nomeProgetto) {
        progettiGestiti.add(nomeProgetto);
    }

    public void assegnaProgetto(String nomeprogetto, String priorità) {
        progettiGestiti.add(nomeprogetto + " -Priorità : " + priorità);
    }

    @Override
    public void riceviPromozione() {
        bonusProgetto += 500;
        System.out.println(getNome() + " ha ricevuto una promozione!");
    }
}
