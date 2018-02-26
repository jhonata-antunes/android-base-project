package com.example.androidbaseproject.activity.example;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.androidbaseproject.R;
import com.example.androidbaseproject.activity.baseActivity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ExampleActivity extends BaseActivity implements ExampleMvpView {

    @BindView(R.id.example_recipe_et)
    EditText mRecipeEt;
    @BindView(R.id.example_progress)
    ProgressBar mProgressPb;
    @BindView(R.id.example_result_tv)
    TextView mResultTv;

    private ExamplePresenter mExamplePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        ButterKnife.bind(this);

        mExamplePresenter = new ExamplePresenter();
        mExamplePresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mExamplePresenter.detachView();
    }

    /***** MVP View methods implementation *****/

    @Override
    public void showProgress() {
        mProgressPb.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissProgress() {
        mProgressPb.setVisibility(View.GONE);
    }

    @Override
    public void showResult(String result) {
        mResultTv.setVisibility(View.VISIBLE);
        mResultTv.setText(result);
    }

    /***** Private helper methods  *****/

    @OnClick(R.id.example_send_btn)
    void onSendClicked() {
        String str = mRecipeEt.getText().toString();
        mExamplePresenter.sendRequest(str);
    }
}
