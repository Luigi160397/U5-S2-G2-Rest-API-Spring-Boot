package epicode.u5s2g2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioniController {

	@GetMapping("/info")
	public String infoGen() {

		return "Inserisci una lingua tra Italiano (ita) e Inglese (eng) come path variable";

	}

	@GetMapping("/info/{lingua}")
	public String infoSpec(@PathVariable String lingua) {
		if (lingua.equals("ita")) {

			return "Benvenuto nel sistema di prenotazioni, ogni prenotazione vale un giorno!";
		} else if (lingua.equals("eng")) {
			return "Welcome to the booking system, every booking is worth one day!";
		} else {
			return "Inserisci una lingua tra Italiano (ita) e Inglese (eng)";
		}
	}
}
