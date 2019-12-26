package bro.games.pokemon.domain.model;

import bro.games.pokemon.domain.model.components.Pokemon;

public class PlayerState {

    private String name;
    private String map;
    private Integer money;

    private Integer pokeball;
    private Integer greatball;
    private Integer ultraball;
    private Integer masterball;

    private Integer maxRevive;

    private Boolean bike;

    private Pokemon p1;
    private Pokemon p2;
    private Pokemon p3;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getPokeball() {
        return pokeball;
    }

    public void setPokeball(Integer pokeball) {
        this.pokeball = pokeball;
    }

    public Integer getGreatball() {
        return greatball;
    }

    public void setGreatball(Integer greatball) {
        this.greatball = greatball;
    }

    public Integer getUltraball() {
        return ultraball;
    }

    public void setUltraball(Integer ultraball) {
        this.ultraball = ultraball;
    }

    public Integer getMasterball() {
        return masterball;
    }

    public void setMasterball(Integer masterball) {
        this.masterball = masterball;
    }

    public Integer getMaxRevive() {
        return maxRevive;
    }

    public void setMaxRevive(Integer maxRevive) {
        this.maxRevive = maxRevive;
    }

    public Boolean getBike() {
        return bike;
    }

    public void setBike(Boolean bike) {
        this.bike = bike;
    }

    public Pokemon getP1() {
        return p1;
    }

    public void setP1(Pokemon p1) {
        this.p1 = p1;
    }

    public Pokemon getP2() {
        return p2;
    }

    public void setP2(Pokemon p2) {
        this.p2 = p2;
    }

    public Pokemon getP3() {
        return p3;
    }

    public void setP3(Pokemon p3) {
        this.p3 = p3;
    }
}
