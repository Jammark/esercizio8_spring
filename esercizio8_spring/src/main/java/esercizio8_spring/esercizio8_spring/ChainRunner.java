package esercizio8_spring.esercizio8_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import esercizio8_spring.esercizio8_spring.esercizio3.Capitano;
import esercizio8_spring.esercizio8_spring.esercizio3.Colonnello;
import esercizio8_spring.esercizio8_spring.esercizio3.Generale;
import esercizio8_spring.esercizio8_spring.esercizio3.Maggiore;
import esercizio8_spring.esercizio8_spring.esercizio3.Tenente;
import esercizio8_spring.esercizio8_spring.esercizio3.Ufficiale;
import lombok.extern.slf4j.Slf4j;

@Component
@Order(3)
@Slf4j
public class ChainRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Ufficiale u1 = new Capitano(new Maggiore(new Tenente(new Colonnello(new Generale()))));
		int importo = 1500;
		log.info("catena di responsabilità per importo: " + importo);
		u1.check(importo);

	}

}
