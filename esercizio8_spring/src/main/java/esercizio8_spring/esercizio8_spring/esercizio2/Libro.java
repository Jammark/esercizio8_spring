package esercizio8_spring.esercizio8_spring.esercizio2;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Libro {

	private Set<String> autori;
	private double prezzo;
	private Set<Sezione> sezioni;

	public int getNumeroPagine() {
		return sezioni.stream().map(Elemento::getNumeroPagine).reduce(0, (sum, e) -> sum + e);
	}

}
