package bro.games.pokemon.persistence;

import bro.games.pokemon.domain.model.components.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 14/05/19 23:05
 */
@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, String> {

}
