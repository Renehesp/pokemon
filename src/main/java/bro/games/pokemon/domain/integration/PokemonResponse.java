package bro.games.pokemon.domain.integration;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 14/05/19 23:35
 */
public class PokemonResponse {

    private Sprites sprites;

    public Sprites getSprites () {
        return sprites;
    }

    public void setSprites (final Sprites sprites) {
        this.sprites = sprites;
    }
}
