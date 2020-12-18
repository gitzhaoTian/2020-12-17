package com.example.day12_18.utils;

public interface INetWorkInterFace {
    <T> void get(String url , INetCallBack<T> callBack);
}
