package com.example.myapplication.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity<T> extends AppCompatActivity {
    private T p;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
        if (p==null){
            p = getPresenter();
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract T getPresenter();

    protected abstract int getLayoutID();
}
