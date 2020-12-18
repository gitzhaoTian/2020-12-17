package com.example.day12_18.presenter;

import com.example.day12_18.base.BasePresenter;
import com.example.day12_18.bean.GirlsBean;
import com.example.day12_18.contract.GirlsContract;
import com.example.day12_18.model.GirlsModelImpl;
import com.example.day12_18.utils.INetCallBack;

public class GirlsPresenterImpl extends BasePresenter implements GirlsContract.GirlsPresenter {
    private final GirlsModelImpl model;
    private GirlsContract.GirlsView girlsView;

    public GirlsPresenterImpl(GirlsContract.GirlsView girlsView) {
        this.girlsView = girlsView;
        model = new GirlsModelImpl(this);
    }

    @Override
    public void get() {
        model.getGirls("Girl/type/Girl/page/8/count/8", new INetCallBack<GirlsBean>() {
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
