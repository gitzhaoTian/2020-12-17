package com.example.myapplication.contract;

import com.example.myapplication.bean.GirlsBean;
import com.example.myapplication.utils.INetCallBack;

public class GirlsContract {
    public interface IGirlsModel{
        <T> void getGirls(String url, INetCallBack<T> callBack);
    }
    public interface IGirlsPresenter{
        void getGirls();
    }
    public interface IGirlsView{
        void getGirls(GirlsBean girlsBean);
        void onFail(String error);
    }
}
