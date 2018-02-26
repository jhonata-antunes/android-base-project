package com.example.androidbaseproject.model.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jhonata on 26/02/18.
 */

public class Result {
    @SerializedName("title")
    private String title;
    @SerializedName("ingredients")
    private String ingredients;

    public String getTitle() {
        return title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
