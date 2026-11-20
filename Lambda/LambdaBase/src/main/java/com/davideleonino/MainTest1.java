package com.davideleonino;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainTest1 {

    public static void main(String[] args) {




        List<Integer> numeri = List.of(1, 2, 3);

        numeri.forEach(numero -> System.out.println(numero * 2)); // non scriviamo il tipo perchè java lo deduce da sè




        String [] parole = { "mondo", "a", "ciao" };

        Arrays.sort(parole, (x, y) -> Integer.compare(x.length(), y.length()));

        {
            System.out.println(Arrays.toString(parole));
        }




    }
}