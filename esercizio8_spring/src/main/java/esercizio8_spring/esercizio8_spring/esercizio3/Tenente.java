package esercizio8_spring.esercizio8_spring.esercizio3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tenente extends Ufficiale {

	public Tenente(Ufficiale responsabile) {
		super(3000, 3, responsabile);

	}

	@Override
	public void funzione() {
		log.info("funzione di tenente");

	}

}
