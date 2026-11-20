package com.davideleonino;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ComandoFactory {

    public static Optional<Comando> crea(String tipo) {

        return switch (tipo) {

            case "somma" -> Optional.of(new Somma());
            case "moltiplica" -> Optional.of(new Moltiplica());
            default -> Optional.empty();


        };
    }


}
