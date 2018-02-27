package com.jsj.designpatterns.singleton;

/**
 * Created by jiangshujing on 2018/2/26.
 * 静态内部类单例模式
 * 这种是推荐使用的单例模式实现方式。
 * 当第一次加载StaticInnerSingleton类时并不会初始化INSTANCE，只是在第一次调用getInstance方法时才会
 * 导致INSTANCE被初始化，这种方式不仅能够保证线程安全，也能保证单例对象的唯一性，同时也延长了单例的实例化
 *
 * 知识补充：类级的内部类，也就是静态类的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，而且只会被调用时才会
 * 装载，从而实现了延迟加载
 */

public class StaticInnerSingleton {

    //私有构造方法
    private StaticInnerSingleton() {

    }

    //对外界提供获取唯一实例的方法
    public static final StaticInnerSingleton getInstance() {
        return SingletonHoder.INSTANCE;
    }

    //静态内部类
    private static class SingletonHoder {
        //静态初始化器，由JVM来保证线程安全
        private static StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
}
