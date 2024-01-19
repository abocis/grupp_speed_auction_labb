package com.example.grupp_speed_auction.service;

import com.example.grupp_speed_auction.models.RecipeModel;
import com.example.grupp_speed_auction.repository.ReceptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    @Autowired
    ReceptRepo receptRepo;

    public RecipeModel createRecipeModel(RecipeModel recipeModel) {
        return receptRepo.save(recipeModel);
    }
}