package at.pokedex.pokedexa.controller;

import at.fhv.pokedex.controller.RestController;
import at.fhv.pokedex.model.Pokemon;
import org.junit.Assert;
import org.junit.Test;

public class RestControllerTest {

    @Test
    public void testSingleton() {
        Assert.assertNotNull(RestController.getInstance());
    }

    @Test
    public void testPokeAPI() throws Exception {
        String token = "pikachu";
        RestController controller = RestController.getInstance();
        Pokemon p = controller.requestPokemon(token);
        Assert.assertEquals(token, p.getName());
    }
}
