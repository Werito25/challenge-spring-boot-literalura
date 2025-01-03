package com.alura.Literalura;

import com.alura.Literalura.libreria.Libreria;
import com.alura.Literalura.repository.iAutorRepository;
import com.alura.Literalura.repository.iLibroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LiteraluraApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx, iLibroRepository libroRepository, iAutorRepository autorRepository) {
		return args -> {
			Libreria libreria = new Libreria(libroRepository, autorRepository);
			libreria.consumo(); // Llamada al método consumo para mostrar el menú
		};
	}
}
