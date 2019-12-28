package bro.games.pokemon.domain.model.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:49
 */
@Entity(name = "pokemon")
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "pokemon_name")
    private String name;

    private String evolution;

    private Integer health;

    private Integer attack;

    @Column(name = "pokemon_level")
    private Integer level;

    @Column(name = "special_move")
    private String specialMove;

    private Integer rarity;

    private String url;

    public Integer getId () {
        return id;
    }

    public void setId (final Integer id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (final String name) {
        this.name = name;
    }

    public String getEvolution () {
        return evolution;
    }

    public void setEvolution (final String evolution) {
        this.evolution = evolution;
    }

    public Integer getHealth () {
        return health;
    }

    public void setHealth (final Integer health) {
        this.health = health;
    }

    public Integer getAttack () {
        return attack;
    }

    public void setAttack (final Integer attack) {
        this.attack = attack;
    }

    public Integer getLevel () {
        return level;
    }

    public void setLevel (final Integer level) {
        this.level = level;
    }

    public String getSpecialMove () {
        return specialMove;
    }

    public void setSpecialMove (final String specialMove) {
        this.specialMove = specialMove;
    }

    public String getUrl () {
        return url;
    }

    public void setUrl (final String url) {
        this.url = url;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }
}
