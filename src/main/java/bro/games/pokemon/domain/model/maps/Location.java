package bro.games.pokemon.domain.model.maps;

import java.util.List;

import bro.games.pokemon.domain.model.components.Item;
import bro.games.pokemon.domain.model.components.Pokemon;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:51
 */
public class Location {

    private String name;

    private List<Item> itemList;

    private List<Location> connections;

    private List<Pokemon> pokemonList;

    public String getName () {
        return name;
    }

    public void setName (final String name) {
        this.name = name;
    }

    public List<Item> getItemList () {
        return itemList;
    }

    public void setItemList (final List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Location> getConnections () {
        return connections;
    }

    public void setConnections (final List<Location> connections) {
        this.connections = connections;
    }

    public List<Pokemon> getPokemonList () {
        return pokemonList;
    }

    public void setPokemonList (final List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
