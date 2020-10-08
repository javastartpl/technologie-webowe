package pl.javastart.recipes;

import org.junit.jupiter.api.*;

class RecipeDaoTest {
    private final RecipeDao dao = new RecipeDao();

    @Test
    public void shouldHaveId() {
        Recipe recipe = new Recipe("recipe title 1", "recipe description", "ingredient1, ingredient2", 111);
        dao.save(recipe);
        Assertions.assertNotNull(recipe.getId());
    }

}
