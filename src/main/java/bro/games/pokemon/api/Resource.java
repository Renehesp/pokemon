package bro.games.pokemon.api;

import java.io.IOException;

import bro.games.pokemon.domain.integration.PokeAPIClient;
import bro.games.pokemon.domain.integration.PokeApiResponse;
import bro.games.pokemon.domain.model.components.Pokemon;
import bro.games.pokemon.domain.utils.ImageDownloader;
import bro.games.pokemon.persistence.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since 14/05/19 23:06
 */
@RestController
@CrossOrigin
public class Resource {

    @Autowired
    PokeAPIClient client;

    @Autowired
    PokemonRepository repository;

    @Autowired
    ImageDownloader downloader;

    @GetMapping(path = "/pokemon/random")
    public String getRandomPokemonImage () throws IOException {
        int id = 1000;

        while (id > 964)
            id = (int) (Math.random() * 1000);

        return client.getPokemon(id).getSprites().getFrontDefault();
    }

    @GetMapping(path = "/pokemon/complete")
    public void completeAll () throws IOException {
        PokeApiResponse response = client.getPokemonList();
        response.getResults().forEach(pokemon -> repository.save(pokemon));
    }

    @GetMapping(path = "/random", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String getFile () throws IOException {
        String url = "../pokemon/1.png";
        return "<img style=\"-webkit-user-select: none\" src=\"" + url + "\"/>";
    }
}
