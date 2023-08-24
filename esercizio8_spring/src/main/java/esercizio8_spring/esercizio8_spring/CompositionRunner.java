package esercizio8_spring.esercizio8_spring;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import esercizio8_spring.esercizio8_spring.esercizio2.Elemento;
import esercizio8_spring.esercizio8_spring.esercizio2.Libro;
import esercizio8_spring.esercizio8_spring.esercizio2.Pagina;
import esercizio8_spring.esercizio8_spring.esercizio2.Sezione;
import lombok.extern.slf4j.Slf4j;

@Component
@Order(2)
@Slf4j
public class CompositionRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Libro l = new Libro(Set.of("Mario Rossi"), 30.60,
				Set.of(new Sezione(Set.of(new Pagina(), new Pagina(), getSezione(10)

				)), new Sezione(Set.of(getSezione(20), new Pagina(), new Sezione(Set.of(getSezione(5), new Pagina()))

				)), new Sezione(Set.of(getSezione(10), getSezione(30)))));
		log.info("Numero pagine total: " + l.getNumeroPagine());

	}

	private static Sezione getSezione(int pagine) {
		Set<Elemento> set = new HashSet<>();
		for (int i = 0; i < pagine; i++) {
			set.add(new Pagina());
		}
		return new Sezione(set);
	}

}
