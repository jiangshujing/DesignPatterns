package com.jsj.designpatterns.singleton;

/**
 * Created by jiangshujing on 2018/2/26.
 * 饿汉式--单例模式
 * 饿汉式是线程安全的，因为虚拟机保证只会装载一次，在装载类的时候是不会发生并发的。
 */

public class EagerSingleton {
    //私有实例对象
    private static EagerSingleton instance = new EagerSingleton();

    //私有构造方法
    private EagerSingleton() {

    }

    //提供让外部访问这个类的唯一实例的方法
    public static EagerSingleton getInstance() {
        return instance;
    }
}
