package com.example.grupp_speed_auction.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;

@Document(collection = "Recept")
public class RecipeModel {


    @Id
    private String id;
    private String title;
    private Array ingrediens;
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

    public Array getIngrediens() {
        return ingrediens;
    }

    public void setIngrediens(Array ingrediens) {
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
