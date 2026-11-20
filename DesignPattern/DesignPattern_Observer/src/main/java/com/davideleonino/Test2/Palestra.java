package com.davideleonino.Test2;

import java.util.ArrayList;
import java.util.List;

public class Palestra implements Subject {

    private final List<Observer> osservatori = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        osservatori.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        osservatori.remove(observer);
    }

    @Override
    public void notifyObservers(IngressoSocio evento) {
        for (Observer observer : osservatori) {
            observer.update(evento);
        }
    }

    public void registraIngresso(String nome, boolean abbonamentoScaduto) {

        IngressoSocio evento = new IngressoSocio(nome, abbonamentoScaduto);

        notifyObservers(evento);
    }
}
