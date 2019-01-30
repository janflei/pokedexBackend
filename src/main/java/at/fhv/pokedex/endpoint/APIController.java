package at.fhv.pokedex.endpoint;

// Start of user code (user defined imports)

// End of user code

import at.fhv.pokedex.controller.PokedexController;
import at.fhv.pokedex.model.History;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@org.springframework.web.bind.annotation.RestController
public class APIController {
	// Start of user code (user defined attributes)

	// End of user code

	@org.springframework.web.bind.annotation.GetMapping("/")
	String home() {
		System.out.println("Test");
		return "Hello World!";
	}

	@org.springframework.web.bind.annotation.GetMapping("/history")
	public History getHistory() throws Exception {
		// Start of user code getHistory
		System.out.println("HISTORY");
		return PokedexController.getInstance().getHistory();
		// End of user code
	}

	@org.springframework.web.bind.annotation.GetMapping("/pokemon")
	public at.fhv.pokedex.model.Pokemon getPokemon(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code getPokemon
		System.out.println("POKEMON");
		return PokedexController.getInstance().request(token);
		// End of user code
	}

	// Start of user code (user defined operations)

	// End of user code
}