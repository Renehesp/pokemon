package bro.games.pokemon.domain.model.components;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:59
 */
public class Item {

    private String name;

    private String desc;

    private Integer number;

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

    public Integer getNumber () {
        return number;
    }

    public void setNumber (final Integer number) {
        this.number = number;
    }
}
