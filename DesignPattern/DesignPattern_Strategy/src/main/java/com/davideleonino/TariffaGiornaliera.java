package com.davideleonino;

public class TariffaGiornaliera implements TariffaParcheggio {

    @Override
    public  double calcolaCosto ( int ore) {
        return 10;
    }
}
