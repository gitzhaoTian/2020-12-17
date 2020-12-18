package com.example.day12_17youye.model;

import com.example.day12_17youye.contract.GirlsContract;
import com.example.day12_17youye.utils.INetCallBack;
import com.example.day12_17youye.utils.RetrofitUtils;

public class GirlsModel implements GirlsContract.GirlsModel {
    private GirlsContract.GirlsPresenter presenter;

    public GirlsModel(GirlsContract.GirlsPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getGirls(String url, INetCallBack<T> callBack) {
        RetrofitUtils.getRetrofitUtils().get(url,callBack);
    }
}
