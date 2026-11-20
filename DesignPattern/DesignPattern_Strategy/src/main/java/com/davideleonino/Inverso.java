package com.davideleonino;

public class Inverso implements Formattazione {

    @Override
    public String applica (String testo) {
        return new StringBuilder(testo).reverse().toString();
    }
}
