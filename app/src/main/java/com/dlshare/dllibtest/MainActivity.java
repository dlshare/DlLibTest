package com.dlshare.dllibtest;

import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dlshare.debuglog.DlLog;

/**
 * dlshare 2017.07.11
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //运行在主线程
        getNameFun("dl", "share");
        //运行在子线程
        new Thread("非UI线程") {
            @Override
            public void run() {
                super.run();
                getNameFun("张", "贝贝");
            }
        }.start();
    }

    /**
     * 编写逻辑处理方法的时候不要写在线程里面，使用时可以用多线程包裹
     */
    @DlLog
    private String getNameFun(String firstName, String lastName) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return firstName + lastName;
    }
}
