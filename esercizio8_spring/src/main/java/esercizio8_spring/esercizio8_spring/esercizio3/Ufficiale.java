package esercizio8_spring.esercizio8_spring.esercizio3;

import lombok.Getter;

@Getter
public abstract class Ufficiale {

	private Ufficiale responsabile;
	private int stipendio, rango;

	protected Ufficiale(int stipendio, int rango, Ufficiale responsabile) {
		this.stipendio = stipendio;
		this.rango = rango;
		this.responsabile = responsabile;

		if (responsabile != null && responsabile.getRango() != getRango() + 1) {
			throw new IllegalArgumentException("Rango non valido");
		}
	}

	public void check(int importo) {
		if (stipendio >= importo) {
			funzione();
		}
		if (responsabile != null) {
			responsabile.check(importo);
		}
	}

	public abstract void funzione();


}
