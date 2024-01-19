package com.example.grupp_speed_auction.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "recipe")
public class RecipeModel {


    @Id
    private String id;
    private String title;
    private List<String> ingrediens;
    private String instructions;
    private String time;
    public RecipeModel() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getIngrediens() {
        return ingrediens;
    }

    public void setIngrediens(List<String> ingrediens) {
        this.ingrediens = ingrediens;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
