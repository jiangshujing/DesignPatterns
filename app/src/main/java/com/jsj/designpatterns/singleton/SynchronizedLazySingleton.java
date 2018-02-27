package com.jsj.designpatterns.singleton;

/**
 * Created by jiangshujing on 2018/2/26.
 * 懒汉式--线程安全的 ，使用synchronized即可
 * 缺点：这样使用synchronized方法会降低整体的访问速度，可以使用双重检查锁
 */

public class SynchronizedLazySingleton {

    //私有实例化对象
    private static SynchronizedLazySingleton instance;

    //私有构造方法
    private SynchronizedLazySingleton() {

    }

    //提供外界访问唯一实例的方法
    /**
     * 这种写法能够在多线程中很好的工作，但是每次调用getInstance方法都会进行同步，
     * 反应稍慢，还会造成不必要的开销
     * @return
     */
    public static synchronized SynchronizedLazySingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }
}
