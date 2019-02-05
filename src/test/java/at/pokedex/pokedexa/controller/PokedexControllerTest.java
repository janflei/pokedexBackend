package at.pokedex.pokedexa.controller;

import at.fhv.pokedex.controller.PokedexController;
import org.junit.Assert;
import org.junit.Test;

public class PokedexControllerTest {

    @Test
    public void testSingleton() {
        Assert.assertNotNull(PokedexController.getInstance());
    }
}
