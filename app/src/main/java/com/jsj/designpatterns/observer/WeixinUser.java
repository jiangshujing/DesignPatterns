package com.jsj.designpatterns.observer;

import android.util.Log;

/**
 * Created by jiangshujing on 2017/11/3.
 * 具体观察者 -- 微信用户
 */

public class WeixinUser implements Observer {

    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }


    @Override
    public void update(String msg) {
        Log.d("消息更新===", name + ":::" + msg);
    }
}
