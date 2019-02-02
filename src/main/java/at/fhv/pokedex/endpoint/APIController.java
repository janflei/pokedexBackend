package at.fhv.pokedex.endpoint;

// Start of user code (user defined imports)

// End of user code

import at.fhv.pokedex.controller.PokedexController;
import at.fhv.pokedex.model.History;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@org.springframework.web.bind.annotation.RestController
public class APIController {
	// Start of user code (user defined attributes)

	// End of user code

	@CrossOrigin(origins = "*")
	@org.springframework.web.bind.annotation.GetMapping(path="/history")
	public History getHistory() throws Exception {
		// Start of user code getHistory
		return PokedexController.getInstance().getHistory();
		// End of user code
	}

	@CrossOrigin(origins = "*")
	@org.springframework.web.bind.annotation.GetMapping(path="/pokemon")
	public at.fhv.pokedex.model.Pokemon getPokemon(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code getPokemon
		return PokedexController.getInstance().request(token);
		// End of user code
	}

	// Start of user code (user defined operations)

	// End of user code
}