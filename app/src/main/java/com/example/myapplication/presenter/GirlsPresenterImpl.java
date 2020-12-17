package com.example.myapplication.presenter;

import com.example.myapplication.base.BasePrese;
import com.example.myapplication.bean.GirlsBean;
import com.example.myapplication.contract.GirlsContract;
import com.example.myapplication.model.GirlsModel;
import com.example.myapplication.utils.INetCallBack;

public class GirlsPresenterImpl extends BasePrese implements GirlsContract.IGirlsPresenter {
    private final GirlsModel model;
    private GirlsContract.IGirlsView girlsView;

    public GirlsPresenterImpl(GirlsContract.IGirlsView girlsView) {
        this.girlsView = girlsView;
        model = new GirlsModel(this);
    }

    @Override
    public void getGirls() {
        model.getGirls("type/Girl/page/1/count/10", new INetCallBack<GirlsBean>() {
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
