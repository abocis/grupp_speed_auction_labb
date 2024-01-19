package com.example.grupp_speed_auction.Controllers;

import com.example.grupp_speed_auction.models.RecipeModel;
import com.example.grupp_speed_auction.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")


public class RecipeController {
    @Autowired
    RecipeService recipeService;

    //POST
    @PostMapping("/recipe")
    public RecipeModel createRecipeModel(RecipeModel recipeModel){

        return recipeService.createRecipeModel(recipeModel);
    }



}
