package com.jsj.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jsj.designpatterns.observer.ObserverTest;
import com.jsj.designpatterns.proxy.ProxyTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProxyTest.test();//代理设计模式
        ObserverTest.test();//观察者模式
    }
}
