package com.example.myapplication.utils;

public interface INetWorkInterFace {
    public <T> void get(String url,INetCallBack<T> callBack);
}
