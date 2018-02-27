package com.jsj.designpatterns.singleton;

import java.io.ObjectStreamException;

/**
 * Created by jiangshujing on 2018/2/26.
 * 懒汉式--非线程安全的
 */

public class LazySingleton {
    //私有实例化对象
    private static LazySingleton instance;

    //私有构造方法
    private LazySingleton() {

    }

    //提供让外部访问这个类的唯一实例的方法
    public static LazySingleton getSingleton() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

    /**
     *
     * @return
     * @throws ObjectStreamException
     * 如果要杜绝单例对象在被反序列化时重新
     * 生成对象，那么必须加入如下方法：
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
