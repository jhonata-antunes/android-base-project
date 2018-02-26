package com.example.androidbaseproject.activity.example;

import com.example.androidbaseproject.activity.baseActivity.BasePresenter;
import com.example.androidbaseproject.model.response.ExampleResponse;
import com.example.androidbaseproject.network.exampleService.ExampleDataManager;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by jhonata on 26/02/18.
 */

public class ExamplePresenter implements BasePresenter<ExampleMvpView> {

    private ExampleDataManager mExampleDataManager;
    private CompositeDisposable mCompositeDisposable;
    private ExampleMvpView mExampleMvpView;

    ExamplePresenter() {
        mExampleDataManager = new ExampleDataManager();
        mCompositeDisposable = new CompositeDisposable();
    }

    /***** BasePresenter methods implementation *****/

    @Override
    public void attachView(ExampleMvpView mvpView) {
        mExampleMvpView = mvpView;
    }

    @Override
    public void detachView() {
        mExampleMvpView = null;
    }

    /***** ExamplePresenter methods implementation *****/

    void sendRequest(String str) {
        mExampleMvpView.showProgress();
        getNumberFact(str);
    }

    /***** Private helper methods  *****/

    private void getNumberFact(String str) {
        mCompositeDisposable.add(mExampleDataManager.getRecipe(str)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.computation())
                .subscribe(new Consumer<ExampleResponse>() {
                               @Override
                               public void accept(ExampleResponse response) throws Exception {
                                   mExampleMvpView.dismissProgress();
                                   String result = response.getTitle() + "\n";
                                   if (response.getResults().size() > 0) {
                                       result += response.getResults().get(0).getTitle() + ": ";
                                       result += response.getResults().get(0).getIngredients();
                                   }
                                   mExampleMvpView.showResult(result);
                               }
                           }
                ));
    }
}
