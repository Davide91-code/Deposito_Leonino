public class DipendentePart extends Dipendente {

    public DipendentePart(Long id, String nome, String cognome,
                          double paga, int orario) {
        super(id, nome, cognome, paga, orario);
    }

    @Override
    public double calcolaStipendio() {
        return getPaga() * getOrario();
    }
}

