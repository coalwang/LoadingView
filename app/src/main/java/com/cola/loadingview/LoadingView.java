package com.cola.loadingview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.zip.Inflater;

public class LoadingView extends FrameLayout{

    private LinearLayout mLoadingLs;
    private ViewStub mNoDataVs;
    private ViewStub mNetErrorVs;

    /////////////////四个构造方法///////////////////////////////////

    public LoadingView(@NonNull Context context) {
        super(context);
        init();
    }

    public LoadingView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LoadingView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        // 第三个参数为true是表明第一个参数作为第二个参数的子布局，或者说给第一个参数指定了父布局
        LayoutInflater.from(getContext()).inflate(R.layout.layout_loading_view, this, true);
        mLoadingLs = (LinearLayout)findViewById(R.id.loading_ll);
        mNoDataVs = (ViewStub)findViewById(R.id.no_data_vs);
        mNetErrorVs = (ViewStub)findViewById(R.id.net_error_vs);
    }

    public void hideView(){
        setVisibility(INVISIBLE);
    }

    public void showView(){
        setVisibility(VISIBLE);
    }

    public void showNotDataView(){
        setVisibility(VISIBLE);
        mLoadingLs.setVisibility(GONE);
        mNoDataVs.setVisibility(VISIBLE);
        mNetErrorVs.setVisibility(GONE);
    }

    public void showLoadingView(){
        setVisibility(VISIBLE);
        mLoadingLs.setVisibility(VISIBLE);
        mNoDataVs.setVisibility(GONE);
        mNetErrorVs.setVisibility(GONE);

    }

    public void showNetErrorView(){
        setVisibility(VISIBLE);
        mLoadingLs.setVisibility(GONE);
        mNoDataVs.setVisibility(GONE);
        mNetErrorVs.setVisibility(VISIBLE);
    }

}
