package bro.games.pokemon.domain.model.components;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:50
 */
public class Quest extends Event {

    private String condition;

    public String getCondition () {
        return condition;
    }

    public void setCondition (final String condition) {
        this.condition = condition;
    }
}
