package com.example.grupp_speed_auction.repository;

import com.example.grupp_speed_auction.models.RecipeModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceptRepo extends MongoRepository<RecipeModel, String> {
}
