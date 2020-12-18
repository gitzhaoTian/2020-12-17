package com.example.day12_17youye.presenter;

import com.example.day12_17youye.base.BasePresenter;
import com.example.day12_17youye.bean.GirlsBean;
import com.example.day12_17youye.contract.GirlsContract;
import com.example.day12_17youye.model.GirlsModel;
import com.example.day12_17youye.utils.INetCallBack;

public class GirlsPresenterImpl extends BasePresenter implements GirlsContract.GirlsPresenter {
    private final GirlsModel model;
    private GirlsContract.GirlsView girlsView;

    public GirlsPresenterImpl(GirlsContract.GirlsView girlsView) {
        this.girlsView = girlsView;
        model = new GirlsModel(this);
    }

    @Override
    public void get() {
        model.getGirls("Girl/type/Girl/page/1/count/10", new INetCallBack<GirlsBean>() {
            @Override
            public void onSuccess(GirlsBean girlsBean) {
                girlsView.getGirls(girlsBean);
            }

            @Override
            public void onFail(String error) {
                girlsView.onFail(error);
            }
        });
    }
}
