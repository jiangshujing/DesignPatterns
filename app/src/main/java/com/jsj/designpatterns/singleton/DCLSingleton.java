package com.jsj.designpatterns.singleton;

/**
 * Created by jiangshujing on 2018/2/26.
 * DCL单例（双重检查加锁）
 * 双重加锁机制：指的是，不是每次进入getInstance方法都需要同步，而是先不同步，进入方法过后，
 * 先检查实例是否存在，如果不存在才进入下面的同步块，这是第一重检查。
 * 进入同步块后，再次检查实例是否存在，如果不存在，就在同步的情况下创建实例，这是二重检查
 *
 * 双重加锁机制的实现会使用关键字Volatle,作用：被volatile修饰的变量的值，将不会被本地线程缓存，
 * 所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量
 *
 * 知识补充：一旦一个共享变量（类的成员变量、类的静态成员变量）被volatile修饰之后，那么就具备了两层语义：
 1）保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
 2）禁止进行指令重排序。
 *
 */

public class DCLSingleton {
    //私有实例化对象
    private volatile static DCLSingleton instance;

    //私有构造方法
    private DCLSingleton() {

    }

    //为外界提供获取唯一实例对象的方法
    public static DCLSingleton getInstance() {
        //一重锁：先判断实例是否存在,不存在进入同步代码块 ,作用：为了不必要的同步
        if(instance == null){
            synchronized (DCLSingleton.class){
                //二重锁：再次判断实例是否存在，如果不存在，创建实例 ，作用：为了在实例不存在的情况下创建实例
                if(instance == null){
                    instance = new DCLSingleton();
                }
            }
        }

        return instance;
    }
}
