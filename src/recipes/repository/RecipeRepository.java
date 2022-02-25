package recipes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import recipes.bean.Recipe;

import java.util.List;

/**
 * @author Fulkin
 * Created on 18.02.2022
 */

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    List<Recipe> findByCategoryIgnoreCaseOrderByDateDesc(String category);

    List<Recipe> findByNameContainsIgnoreCaseOrderByDateDesc(String name);
}
