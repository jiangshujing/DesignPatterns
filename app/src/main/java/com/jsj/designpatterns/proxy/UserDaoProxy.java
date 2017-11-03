package com.jsj.designpatterns.proxy;

/**
 * Created by jiangshujing on 2017/10/26.
 * 代理模式 静态代理
 */

public class UserDaoProxy implements IUserDao {

    /**
     * 目标对象
     */
    private IUserDao target;

    /**
     * 接收目标对象
     * @param target
     */
    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始事务...");
        target.save();//执行目标对象的方法
        System.out.println("提交事务...");
    }
}
