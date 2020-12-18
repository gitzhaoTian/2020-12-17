package com.example.day12_18.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day12_18.R;
import com.example.day12_18.adapter.GirlsAdapter;
import com.example.day12_18.base.BaseActivity;
import com.example.day12_18.bean.GirlsBean;
import com.example.day12_18.contract.GirlsContract;
import com.example.day12_18.presenter.GirlsPresenterImpl;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<GirlsPresenterImpl> implements GirlsContract.GirlsView {

    @BindView(R.id.rv_girls)
    RecyclerView rvGirls;
    private ArrayList<GirlsBean.DataBean> list;
    private GirlsAdapter adapter;

    @Override
    protected void initData() {
        rvGirls.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        adapter = new GirlsAdapter(this, list);
        rvGirls.setAdapter(adapter);
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
    protected int getLayoutID() {
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