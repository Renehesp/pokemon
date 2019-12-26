package bro.games.pokemon.domain.model.trainers;

import java.util.List;

import bro.games.pokemon.domain.model.components.Pokemon;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:47
 */
public class Trainer {

    private String name;

    private List<Pokemon> pokemonList;

    public String getName () {
        return name;
    }

    public void setName (final String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemonList () {
        return pokemonList;
    }

    public void setPokemonList (final List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
