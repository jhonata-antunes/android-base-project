package com.example.androidbaseproject.activity.baseActivity;

/**
 * Created by jhonata on 26/02/18.
 */

/**
 * Base interface that any class that wants to act as a View in the MVP (Model View BasePresenter)
 * pattern must implement. Generally this interface will be extended by a more specific interface
 * that then usually will be implemented by an Activity or Fragment.
 */

public interface BaseMvpView {

    void showProgress();

    void dismissProgress();
}
