
package bro.games.pokemon.domain.service;

import bro.games.pokemon.domain.model.components.Pokemon;
import bro.games.pokemon.persistence.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class RandomService {

    private double[][] rarities = {
            {35,1},
            {33,3},
            {7.2,4},
            {5.05,5},
            {4.16,6},
            {3.6,7},
            {3.125,8},
            {2.5,10},
            {2,12},
            {1.8,14},
            {1.25,20},
            {1,25}
    };

    @Autowired
    private PokemonRepository pokemonRepository;

    public Pokemon getRandomPokemon(){
        Random random = new Random();
        double rarity = 0;
        double rnd = Math.round(random.nextDouble() * 100);
        double total = 0;
        for (int j = 0; j < rarities.length; j++) {
            total += rarities[j][0];
            if (rnd <= total) {
                rarity = rarities[j][1];
                break;
            }
        }
        Iterable<Pokemon> pokemonList = pokemonRepository.findAll();
        double finalRarity = rarity;
        List<Pokemon> filteredList = StreamSupport.stream(pokemonList.spliterator(),false)
                .filter(pkm -> pkm.getRarity() == finalRarity)
                .collect(Collectors.toList());
        int i = random.nextInt(filteredList.size());
        return filteredList.get(i < 0 ? i*-1 : i);
    }
}
