package com.example.myapplication.model;

import com.example.myapplication.contract.GirlsContract;
import com.example.myapplication.utils.INetCallBack;
import com.example.myapplication.utils.RetrofitUtils;

public class GirlsModel implements GirlsContract.IGirlsModel {
    private GirlsContract.IGirlsPresenter presenter;

    public GirlsModel(GirlsContract.IGirlsPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getGirls(String url, INetCallBack<T> callBack) {
        RetrofitUtils.getRetrofitUtils().get(url,callBack);
    }
}
