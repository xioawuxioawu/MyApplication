package com.example.rjs.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tip)
    TextView tip;
    @BindView(R.id.sr_layout)
    SwipeRefreshLayout srLayout;

    @Override
    void initData() {

    }

    @Override
    void initView() {
        srLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
//                srLayout.setRefreshing(true);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        srLayout.setRefreshing(false);
                    }
                }, 1000);
            }
        });
    }

    @Override
    int getlayout() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.tip, R.id.sr_layout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tip:
                break;
            case R.id.sr_layout:
                break;
            default:
                break;
        }
    }
}
