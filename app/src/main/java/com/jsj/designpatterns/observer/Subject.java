package com.jsj.designpatterns.observer;

/**
 * Created by jiangshujing on 2017/11/3.
 * 抽象被观察者 -- 微信公众号
 * 可以增加和删除观察者对象
 */

public interface Subject {

    /**
     * 增加订阅者
     *
     * @param observer
     */
    void add(Observer observer);

    /**
     * 删除订阅者
     *
     * @param observer
     */
    void delete(Observer observer);

    /**
     * 通知订阅者更新消息
     */
    void notify(String msg);
}
