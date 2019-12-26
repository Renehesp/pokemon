package bro.games.pokemon.domain.model.maps;

import java.util.List;

import bro.games.pokemon.domain.model.components.Event;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:50
 */
public class Route extends Location {

    private List<Event> eventList;

    public List<Event> getEventList () {
        return eventList;
    }

    public void setEventList (final List<Event> eventList) {
        this.eventList = eventList;
    }
}
