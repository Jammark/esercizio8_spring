package esercizio8_spring.esercizio8_spring.esercizio3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Generale extends Ufficiale {

	public Generale() {
		super(5000, 5, null);

	}

	@Override
	public void funzione() {
		log.info("funzione di generale");

	}

}
