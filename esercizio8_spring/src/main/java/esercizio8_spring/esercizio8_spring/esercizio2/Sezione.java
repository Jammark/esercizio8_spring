package esercizio8_spring.esercizio8_spring.esercizio2;

import java.util.Set;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Sezione implements Elemento {

	private Set<Elemento> sottoelementi;

	@Override
	public int getNumeroPagine() {

		return this.sottoelementi.stream().map(Elemento::getNumeroPagine).reduce(0, (sum, el) -> sum + el);
	}

}
