package com.davideleonino.gestione_prodotti_Spring;

import com.davideleonino.gestione_prodotti_Spring.service.PrezzoService;
import com.davideleonino.gestione_prodotti_Spring.service.ProdottoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestioneProdottiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestioneProdottiSpringApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner (ProdottoService prodottoService) {

        return args -> {
            prodottoService.stampaCatalogo(20);
        };
    }

}
