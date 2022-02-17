package recipes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Fulkin
 * Created on 13.02.2022
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    private String name;
    private String description;
    private String[] ingredients;
    private String[] directions;
}
