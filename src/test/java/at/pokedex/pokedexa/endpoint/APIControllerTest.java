package at.pokedex.pokedexa.endpoint;

import at.fhv.pokedex.Application;
import at.fhv.pokedex.endpoint.APIController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(APIController.class)
@ContextConfiguration(classes={Application.class})
public class APIControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void requestHistoryResponseIsOk() throws Exception {
        mvc.perform(get("/history").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void requestPokemonResponseIsOk() throws Exception {
        String token = "pikachu";
        mvc.perform(get("/pokemon?token="+token).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
}
