package com.davideleonino;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InizialeMaiuscola implements Formattazione {

    public String applica (String testo) {

        return Arrays.stream(testo.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase()
                        + s.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));


    }
}



