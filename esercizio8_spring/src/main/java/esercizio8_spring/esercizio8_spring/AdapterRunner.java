package esercizio8_spring.esercizio8_spring;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import esercizio8_spring.esercizio8_spring.esercizio1.Info;
import esercizio8_spring.esercizio8_spring.esercizio1.InfoAdapter;
import esercizio8_spring.esercizio8_spring.esercizio1.UserData;
import lombok.extern.slf4j.Slf4j;

@Component
@Order(1)
@Slf4j
public class AdapterRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Info info = new Info("Mario", "Rossi", Date.valueOf(LocalDate.of(1980, 7, 4)));
		UserData ud = new UserData();
		ud.getData(new InfoAdapter(info));
		log.info(ud.toString());

	}

}
