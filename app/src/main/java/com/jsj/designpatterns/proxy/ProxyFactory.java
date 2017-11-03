package com.jsj.designpatterns.proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jiangshujing on 2017/10/26.
 * 创建动态代理对象
 * 动态代理不需要实现接口，但是需要指定接口类型
 */

public class ProxyFactory {
    /**
     * 维护一个目标对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     *
     * @return
     */
    public Object getProxyInstance() {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Log.d("ProxyFactory", "动态代理开始事务");
                //执行目标对象方法，给动态类指定目标 target，和参数
                Object returnValue = method.invoke(target, args);
                Log.d("ProxyFactory", "动态代理提交事务");

                return returnValue;
            }
        });

    }
}
