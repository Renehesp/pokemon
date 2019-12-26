package bro.games.pokemon.domain.integration;

import java.io.IOException;
import java.util.Collections;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 11/05/19 23:07
 */
@Component
public class PokeAPIClient {

    @Autowired
    ObjectMapper objectMapper;

    private String url = "https://pokeapi.co/api/v2/";

    public PokeApiResponse getPokemonList () throws IOException {

        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("user-agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<Void> entity = new HttpEntity<>(null, headers);
        ResponseEntity<PokeApiResponse> res = rt
                .exchange(url + "pokemon/?offset=0&limit=1000", HttpMethod.GET, entity, PokeApiResponse.class);

        return res.getBody();
    }

    public PokemonResponse getPokemon (int id) throws IOException {

        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("user-agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<Void> entity = new HttpEntity<>(null, headers);
        ResponseEntity<PokemonResponse> res = rt
                .exchange(url + "pokemon/" + id, HttpMethod.GET, entity, PokemonResponse.class);

        return res.getBody();
    }

}
