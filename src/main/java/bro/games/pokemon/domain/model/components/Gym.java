package bro.games.pokemon.domain.model.components;

import bro.games.pokemon.domain.model.trainers.Trainer;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 01:56
 */
public class Gym {

    private Trainer leader;

    private Badge badge;

    public Trainer getLeader () {
        return leader;
    }

    public void setLeader (final Trainer leader) {
        this.leader = leader;
    }

    public Badge getBadge () {
        return badge;
    }

    public void setBadge (final Badge badge) {
        this.badge = badge;
    }
}
