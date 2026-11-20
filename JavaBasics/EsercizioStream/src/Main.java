import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Dipendente> dipendenti = new ArrayList<>();

        dipendenti.add(new DipendenteFullTime(
                1L, "Davide", "leonino", 2500, 160));

        dipendenti.add(new DipendentePart(
                2L, "Mattia", "Boschi", 15, 80));

        dipendenti.add(new DipendenteFullTime(
                3L, "Anna", "Magnani", 2200, 160));

        dipendenti.add(new DipendentePart(
                4L, "Giulia", "piccoli", 18, 120));

        dipendenti.add(new DipendenteFullTime(
                5L, "Eddy", "Smith", 1900, 160));

        System.out.println("Elenco completo dipendenti");

        for (Dipendente d : dipendenti) {
            System.out.println(d);
        }

        System.out.println("\nStipendi superiori a 2000 euro");

        for (Dipendente d : dipendenti) {
            if (d.calcolaStipendio() > 2000) {
                System.out.println(d);
            }
        }



        Long idDaCercare = 1L;

        Optional<Dipendente> trovato = dipendenti.stream()
                .filter(d -> d.getId().equals(idDaCercare))
                .findFirst();

        if (trovato.isPresent()) {
            System.out.println("Dipendente trovato: " + trovato.get());
        } else {
            System.out.println("Dipendente non trovato.");
        }

        dipendenti.sort(
                Comparator.comparing(Dipendente::getCognome)
        );

        System.out.println("\nOrdinati per Cognome");

        for (Dipendente d : dipendenti) {
            System.out.println(d);
        }

        double somma = 0;

        for (Dipendente d : dipendenti) {
            somma = somma + d.calcolaStipendio();
        }

        double media = 0;

        if (!dipendenti.isEmpty()) {
            media = somma / dipendenti.size();
        }

        System.out.println("Stipendio medio: " + media + " euro");

        double massimo = 0;

        for (Dipendente d : dipendenti) {
            if (d.calcolaStipendio() > massimo) {
                massimo = d.calcolaStipendio();
            }
        }

        System.out.println("Stipendio massimo: " + massimo + " euro");






    }
}