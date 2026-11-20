public abstract class Dipendente implements Calcolabile {

    private Long id;
    private String nome;
    private String cognome;
    private double paga;
    private int orario;


    public Dipendente(Long id, String nome, String cognome, double paga, int orario) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.paga = paga;
        this.orario = orario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getPaga() {
        return paga;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }

    public int getOrario() {
        return orario;
    }

    public void setOrario(int orario) {
        this.orario = orario;
    }

    @Override
    public abstract double calcolaStipendio();

    @Override
    public String toString() {
        return "Dipendente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", paga=" + paga +
                ", orario=" + orario +
                '}';
    }
}
