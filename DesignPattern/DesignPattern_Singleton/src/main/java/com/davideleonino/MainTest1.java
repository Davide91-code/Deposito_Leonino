package com.davideleonino;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTest1 {
    public static void main(String[] args) {

        Termostato a = Termostato.getInstance(); // normalmente avremmo creato 2 oggetti ma in questo caso noi facciamo riferimento sempre allo stesso
        Termostato b = Termostato.getInstance();

        a.setTemperatura(220.5);

        System.out.println(a.getTemperatura());
        System.out.println(b.getTemperatura());

        System.out.println(a == b); // e qui ne abbiamo la conferma.







    }
}