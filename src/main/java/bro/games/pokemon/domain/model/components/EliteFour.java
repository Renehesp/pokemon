package bro.games.pokemon.domain.model.components;

import java.util.List;

import bro.games.pokemon.domain.model.trainers.Trainer;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 12/05/19 02:23
 */
public class EliteFour {

    private List<Trainer> eliteTrainers;

    private Trainer champion;

    public List<Trainer> getEliteTrainers () {
        return eliteTrainers;
    }

    public void setEliteTrainers (final List<Trainer> eliteTrainers) {
        this.eliteTrainers = eliteTrainers;
    }

    public Trainer getChampion () {
        return champion;
    }

    public void setChampion (final Trainer champion) {
        this.champion = champion;
    }
}
