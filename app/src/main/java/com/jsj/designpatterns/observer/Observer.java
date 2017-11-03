package com.jsj.designpatterns.observer;

/**
 * Created by jiangshujing on 2017/11/3.
 * 抽象观察者
 */

public interface Observer {
    /**
     * 消息更新
     * @param msg
     */
    void update(String msg);
}
