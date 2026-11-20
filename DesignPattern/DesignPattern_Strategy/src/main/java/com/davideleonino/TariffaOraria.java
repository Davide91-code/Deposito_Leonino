package com.davideleonino;

public class TariffaOraria implements TariffaParcheggio {

    @Override
    public  double calcolaCosto ( int ore) {
        return ore *2;
    }

}
