package com.gionee.wsq.cricleprogress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity{
    private CircleProgressView mCircleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mCircleProgressView = (CircleProgressView) findViewById(R.id.test_progress);
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i<=100){
                    try {
                        mCircleProgressView.setProgress(i,i+"","%","进度");
                        i++;
                        Thread.sleep(100);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
