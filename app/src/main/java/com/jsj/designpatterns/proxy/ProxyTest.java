package com.jsj.designpatterns.proxy;

import android.util.Log;

/**
 * Created by jiangshujing on 2017/11/3.
 */

public class ProxyTest {

    public static void test() {
        //------------------静态代理------------------------
        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(new UserDao());
        proxy.save();//执行的是代理的方法

        //------------------动态代理------------------------

        UserDao target = new UserDao();//目标对象
        //原始类型 com.jsj.designpatterns.proxy.UserDao
        Log.d("ProxyTest", target.getClass().

                toString());

        //给目标对象创建代理对象
        IUserDao dynamicProxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        //class $Proxy0   内存中动态生成的代理对象
        Log.d("ProxyTest", dynamicProxy.getClass().toString());
        //执行方法
        dynamicProxy.save();
    }
}
