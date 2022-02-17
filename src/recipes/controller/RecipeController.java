package recipes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import recipes.model.Recipe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Fulkin
 * Created on 13.02.2022
 */

@RestController
public class RecipeController {
    private static Map<Integer, Recipe> recipeList = new ConcurrentHashMap<>();
    private static int count = 0;

    @PostMapping("/api/recipe/new")
    Map<String, Integer> setRecipe(@RequestBody Recipe recipe) {
        int id = ++count;
        recipeList.put(count, recipe);
        return Map.of("id", count);
    }

    @GetMapping("/api/recipe/{id}")
    Recipe getRecipe(@PathVariable int id) {
        Recipe recipe = recipeList.get(id);
        if (recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return recipe;
    }
}
