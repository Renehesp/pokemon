package bro.games.pokemon.domain.model.trainers;

import java.util.List;

import bro.games.pokemon.domain.model.components.Badge;
import bro.games.pokemon.domain.model.components.Item;
import bro.games.pokemon.domain.model.maps.Location;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:47
 */
public class Player extends Trainer {

    private List<Badge> badgeList;

    private List<Item> itemList;

    private Location location;

    public List<Badge> getBadgeList () {
        return badgeList;
    }

    public void setBadgeList (final List<Badge> badgeList) {
        this.badgeList = badgeList;
    }

    public List<Item> getItemList () {
        return itemList;
    }

    public void setItemList (final List<Item> itemList) {
        this.itemList = itemList;
    }

    public Location getLocation () {
        return location;
    }

    public void setLocation (final Location location) {
        this.location = location;
    }
}
