package com.example.androidbaseproject.network.baseService;

import android.provider.SyncStateContract;

import com.example.androidbaseproject.helpers.Constants;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jhonata on 26/02/18.
 */

public class BaseService {

    public <T> T getService(Class<T> serviceClass) {
        final Retrofit retrofit = createRetrofit();
        return retrofit.create(serviceClass);
    }

    private Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                // TODO: client(createOkHttpClient())
                .build();
    }
}
