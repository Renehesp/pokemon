package bro.games.pokemon.domain.model.components;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 02:31
 */
public class Move {

    private String name;

    private Integer damage;

    public String getName () {
        return name;
    }

    public void setName (final String name) {
        this.name = name;
    }

    public Integer getDamage () {
        return damage;
    }

    public void setDamage (final Integer damage) {
        this.damage = damage;
    }
}
