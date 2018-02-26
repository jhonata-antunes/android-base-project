package com.example.androidbaseproject.network.exampleService;

import com.example.androidbaseproject.model.response.ExampleResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jhonata on 26/02/18.
 */

public interface ExampleService {

    @GET("./")
    Observable<ExampleResponse> getRecipe(@Query("q") String str);
}
