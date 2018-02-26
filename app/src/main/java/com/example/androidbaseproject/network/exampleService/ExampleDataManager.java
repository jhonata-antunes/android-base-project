package com.example.androidbaseproject.network.exampleService;

import com.example.androidbaseproject.model.response.ExampleResponse;
import com.example.androidbaseproject.network.baseService.BaseService;

import io.reactivex.Observable;

/**
 * Created by jhonata on 26/02/18.
 */

public class ExampleDataManager extends BaseService {

    private ExampleService mExampleService;

    public ExampleDataManager() {
        mExampleService = getService(ExampleService.class);
    }

    public Observable<ExampleResponse> getRecipe(String str) {
        return mExampleService.getRecipe(str);
    }
}
