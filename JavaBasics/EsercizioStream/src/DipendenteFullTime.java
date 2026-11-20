public class DipendenteFullTime extends Dipendente{


    public DipendenteFullTime(Long id, String nome, String cognome,
                              double paga, int orario) {
        super(id, nome, cognome, paga, orario);
    }

    @Override
    public double calcolaStipendio() {
        return getPaga();
    }
}

