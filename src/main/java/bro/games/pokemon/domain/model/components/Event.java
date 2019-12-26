package bro.games.pokemon.domain.model.components;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:50
 */
public class Event {

    private String name;

    private String desc;

    public String getName () {
        return name;
    }

    public void setName (final String name) {
        this.name = name;
    }

    public String getDesc () {
        return desc;
    }

    public void setDesc (final String desc) {
        this.desc = desc;
    }
}
