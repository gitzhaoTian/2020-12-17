package com.example.myapplication.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.GirlsAdapter;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.bean.GirlsBean;
import com.example.myapplication.contract.GirlsContract;
import com.example.myapplication.presenter.GirlsPresenterImpl;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<GirlsPresenterImpl> implements GirlsContract.IGirlsView {

    @BindView(R.id.rv_main)
    RecyclerView rvMain;
    private ArrayList<GirlsBean.DataBean> list;
    private GirlsAdapter girlsAdapter;

    @Override
    protected void initData() {
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        girlsAdapter = new GirlsAdapter(this, list);
        rvMain.setAdapter(girlsAdapter);
        getPresenter().getGirls();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected GirlsPresenterImpl getPresenter() {
        return new GirlsPresenterImpl(this);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void getGirls(GirlsBean girlsBean) {
        list.addAll(girlsBean.getData());
        girlsAdapter.notifyDataSetChanged();
    }

    @Override
    public void onFail(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}