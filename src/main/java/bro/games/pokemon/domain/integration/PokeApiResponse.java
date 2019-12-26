package bro.games.pokemon.domain.integration;

import java.util.List;

import bro.games.pokemon.domain.model.components.Pokemon;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 14/05/19 23:27
 */
public class PokeApiResponse {

    private int count;

    private String next;

    private String previous;

    private List<Pokemon> results;

    public int getCount () {
        return count;
    }

    public void setCount (final int count) {
        this.count = count;
    }

    public String getNext () {
        return next;
    }

    public void setNext (final String next) {
        this.next = next;
    }

    public String getPrevious () {
        return previous;
    }

    public void setPrevious (final String previous) {
        this.previous = previous;
    }

    public List<Pokemon> getResults () {
        return results;
    }

    public void setResults (final List<Pokemon> results) {
        this.results = results;
    }
}
