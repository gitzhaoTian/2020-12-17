package com.example.day12_17youye.utils;

public interface INetWorkInterface {
    public <T> void get(String url,INetCallBack<T> callBack);
}
