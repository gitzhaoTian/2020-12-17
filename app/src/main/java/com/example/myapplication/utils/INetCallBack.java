package com.example.myapplication.utils;

public interface INetCallBack<T> {
    public void onSuccess(T t);
    public void onFail(String error);
}
