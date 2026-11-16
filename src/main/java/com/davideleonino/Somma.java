package com.davideleonino;

public class Somma implements Comando {

    @Override
    public String esegui(int a, int b) {
        return String.valueOf(a + b);
    }
}
