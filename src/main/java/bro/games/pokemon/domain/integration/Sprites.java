package bro.games.pokemon.domain.integration;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 14/05/19 23:36
 */
public class Sprites {

    @JsonProperty("front_default")
    private String frontDefault;

    public String getFrontDefault () {
        return frontDefault;
    }

    public void setFrontDefault (final String frontDefault) {
        this.frontDefault = frontDefault;
    }
}
