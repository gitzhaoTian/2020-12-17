package com.example.day12_17youye;

import android.os.Bundle;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day12_17youye.adapter.GirlsAdapter;
import com.example.day12_17youye.base.BaseActivity;
import com.example.day12_17youye.bean.GirlsBean;
import com.example.day12_17youye.contract.GirlsContract;
import com.example.day12_17youye.presenter.GirlsPresenterImpl;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<GirlsPresenterImpl> implements GirlsContract.GirlsView {

    @BindView(R.id.rv_main)
    RecyclerView rvMain;
    private ArrayList<GirlsBean.DataBean> list;
    private GirlsAdapter adapter;

    @Override
    protected void initData() {
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        adapter = new GirlsAdapter(this, list);
        rvMain.setAdapter(adapter);
        presenter.get();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected GirlsPresenterImpl getPresenter() {
        return new GirlsPresenterImpl(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void getGirls(GirlsBean girlsBean) {
        list.addAll(girlsBean.getData());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onFail(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}