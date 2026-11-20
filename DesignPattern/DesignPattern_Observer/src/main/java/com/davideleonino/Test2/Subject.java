package com.davideleonino.Test2;

//questa classe farà da subject, ma contrariamente alla precedente
// conterrà solo i metodi da implementare
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(IngressoSocio evento);

}