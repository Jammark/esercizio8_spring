package esercizio8_spring.esercizio8_spring.esercizio3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Maggiore extends Ufficiale {

	public Maggiore(Ufficiale responsabile) {
		super(2000, 2, responsabile);

	}

	@Override
	public void funzione() {
		log.info("funzione di maggiore");

	}

}
