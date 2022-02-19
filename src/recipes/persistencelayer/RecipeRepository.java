package recipes.persistencelayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import recipes.businesslayer.Recipe;

/**
 * @author Fulkin
 * Created on 18.02.2022
 */

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
