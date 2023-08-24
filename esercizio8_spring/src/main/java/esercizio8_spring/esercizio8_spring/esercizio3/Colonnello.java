package esercizio8_spring.esercizio8_spring.esercizio3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Colonnello extends Ufficiale {

	public Colonnello(Ufficiale responsabile) {
		super(4000, 4, responsabile);

	}

	@Override
	public void funzione() {
		log.info("funzione di colonnello");

	}

}
