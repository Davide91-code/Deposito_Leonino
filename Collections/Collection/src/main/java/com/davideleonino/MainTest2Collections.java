package com.davideleonino;

import java.util.ArrayList;

public class MainTest2Collections {

    public static void main(String[] args) {

        ArrayList<String> playlist = new ArrayList<>();

        playlist.add("Intro");
        playlist.add("Groove");
        playlist.add("Ballad");
        playlist.add("Finale");

        playlist.remove(2);

        playlist.add(0, "Sorpresa");

        for (String brano : playlist) {
            System.out.println(brano);
        }

        System.out.println("Numero brani: " + playlist.size());
    }


}



