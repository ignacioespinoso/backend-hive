package com.example.demo.service;

import com.example.demo.exception.InvalidInputException;
import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    public RecipeService() {

    }

    // CREATE
    @Transactional
    public Recipe createRecipe(Recipe recipe){
        if(recipe.getId() != null && recipe.getId() != 0) {
            throw new InvalidInputException("Invalid input id!");
        }

        Recipe createdRecipe = recipeRepository.save(recipe);
        return createdRecipe;
    }
    // READ
    public List<Recipe> listAllRecipes() {
        List<Recipe> recipeList = this.recipeRepository.findAll();

        return recipeList;
    }
}
