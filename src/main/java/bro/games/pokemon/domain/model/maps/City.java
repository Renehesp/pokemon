package bro.games.pokemon.domain.model.maps;

import java.util.List;

import bro.games.pokemon.domain.model.components.Gym;
import bro.games.pokemon.domain.model.components.Quest;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:50
 */
public class City extends Location {

    private Gym gym;

    private List<Quest> questList;

    public Gym getGym () {
        return gym;
    }

    public void setGym (final Gym gym) {
        this.gym = gym;
    }

    public List<Quest> getQuestList () {
        return questList;
    }

    public void setQuestList (final List<Quest> questList) {
        this.questList = questList;
    }
}
