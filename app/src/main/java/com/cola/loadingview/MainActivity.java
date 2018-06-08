package com.cola.loadingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button show = (Button)findViewById(R.id.show_btn);
        Button hide = (Button)findViewById(R.id.hide_btn);
        final Button loading = (Button)findViewById(R.id.loading_btn);
        Button noData = (Button)findViewById(R.id.no_data_btn);
        Button netError = (Button)findViewById(R.id.net_error_btn);
        final LoadingView loadingView = (LoadingView)findViewById(R.id.loading_view_lv) ;
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingView.showView();
            }
        });
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingView.hideView();
            }
        });
        loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingView.showLoadingView();
            }
        });
        noData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingView.showNotDataView();
            }
        });
        netError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingView.showNetErrorView();
            }
        });

    }
}
