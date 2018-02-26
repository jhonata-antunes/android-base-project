package com.example.androidbaseproject.activity.baseActivity;

/**
 * Created by jhonata on 26/02/18.
 */

/**
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the BaseMvpView type that wants to be attached with.
 */

public interface BasePresenter<V extends BaseMvpView> {

    void attachView(V mvpView);

    void detachView();
}
