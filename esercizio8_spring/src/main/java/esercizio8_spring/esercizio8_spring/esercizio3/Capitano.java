package esercizio8_spring.esercizio8_spring.esercizio3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Capitano extends Ufficiale {

	private Ufficiale responsabile;

	public Capitano(Ufficiale responsabile) {
		super(1000, 1, responsabile);

	}

	@Override
	public void funzione() {
		log.info("Funzione di capitano");

	}


}
