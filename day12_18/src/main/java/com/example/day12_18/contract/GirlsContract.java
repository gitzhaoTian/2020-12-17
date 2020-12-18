package com.example.day12_18.contract;

import com.example.day12_18.bean.GirlsBean;
import com.example.day12_18.utils.INetCallBack;

public class GirlsContract {
    public interface GirlsModel{
        <T> void getGirls(String url , INetCallBack<T> callBack);
    }
    public interface GirlsPresenter{
        void get();
    }
    public interface GirlsView{
        void getGirls(GirlsBean girlsBean);
        void onFail(String error);
    }
}