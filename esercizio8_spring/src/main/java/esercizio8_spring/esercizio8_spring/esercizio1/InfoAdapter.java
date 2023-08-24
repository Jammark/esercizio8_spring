package esercizio8_spring.esercizio8_spring.esercizio1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InfoAdapter implements DataSource {

	private Info info;

	public InfoAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {

		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		LocalDate ld = LocalDate.parse(format.format(info.getDataDiNascita()), DateTimeFormatter.ISO_LOCAL_DATE);
		return LocalDate.now().getYear() - ld.getYear();
	}

}
