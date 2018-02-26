package com.example.androidbaseproject.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jhonata on 26/02/18.
 */

public class ExampleResponse {
    @SerializedName("title")
    private String title;
    @SerializedName("results")
    private List<Result> results;

    public String getTitle() {
        return title;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
