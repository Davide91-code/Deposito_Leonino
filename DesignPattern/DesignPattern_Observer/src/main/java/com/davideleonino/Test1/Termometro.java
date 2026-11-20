package com.davideleonino.Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


// questa classe farà da subject (publisher):
// possiede lo stato e si occupa di comunicarlo agli osservatori (listener) quando cambia.

public class Termometro {

    //CONSUMER è interfaccia funzionale Java che accetta un singolo argomento in input
    //e non restituisce alcun risultato.
    //Creiamo una lista osservatori che riceveranno le notifiche

    private final List<Consumer<Double>> osservatori = new ArrayList<>();

    //aggiungiamo un osservatore alla lista

    void iscrivi(Consumer<Double> o) {
        osservatori.add(o);
    }

    //comunica un evento.
    //accept esegue il comportamento dell osservatore passandogli l evento

    void registra(double temperatura) {
        for (Consumer<Double> o : osservatori) {
            o.accept(temperatura);
        }
    }

}
