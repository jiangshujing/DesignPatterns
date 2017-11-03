package com.jsj.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangshujing on 2017/11/3.
 * csdn公众号，具体主题(具体被观察者)
 * 里面存储了订阅该公众号的所有微信用户，并实现了抽象主题中的方法：
 */

public class CsdnWeixinSubject implements Subject {

    private List<Observer> weixinUsers = new ArrayList<>();


    @Override
    public void add(Observer observer) {
        weixinUsers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        weixinUsers.remove(observer);
    }

    /**
     * 通知所有的订阅用户
     *
     * @param msg
     */
    @Override
    public void notify(String msg) {
        for (Observer observer : weixinUsers) {
            observer.update(msg);
        }
    }
}
