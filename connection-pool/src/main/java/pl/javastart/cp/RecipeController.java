package pl.javastart.cp;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

@WebServlet("")
public class RecipeController extends HttpServlet {
    private final RecipeDao recipeDao = new RecipeDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        List<Recipe> allRecipes = recipeDao.findAll();
        allRecipes.forEach(System.out::println);
    }
}
