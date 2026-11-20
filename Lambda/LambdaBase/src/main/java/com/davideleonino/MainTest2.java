package com.davideleonino;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainTest2 {

    public static void main(String[] args) {

        List<String> frutta = new ArrayList<>(
                List.of("kiwi", "banana", "mela", "ananas", "pera", "fico", "arancia")
        );

        Consumer<String> stampa = parola -> System.out.println(parola); // fornisco un dato, eseguo solo l operazione di stampa.
        //abbiamo creato la funzione consumer stampa

        frutta.forEach(stampa);

        Predicate <String> parolaCorta = parola -> parola.length() <= 4; // non le sto ordinando, ma solo verificando quali rispettano data condizione

        frutta.removeIf(parolaCorta);

        //frutta.forEach(stampa); continuerebbe a stampare sia la prima operazione che la seconda, allungando la lista


        // dato che compariamo i due elementi,
        // se il risultato è negativo, a vien eprima di b, se no il contrario.

        Comparator <String> ordinamento = (a, b) -> {

            int confrontoLunghezza = Integer.compare(b.length(), a.length());

            if (confrontoLunghezza != 0) {
                return confrontoLunghezza;
            }
            return a.compareTo(b);
        };

        frutta.sort(ordinamento);

        System.out.println("--");

        frutta.forEach(stampa);








    }
}