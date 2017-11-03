package com.jsj.designpatterns.proxy;

import android.util.Log;

/**
 * Created by jiangshujing on 2017/10/26.
 * 目标对象 实现接口
 */

public class UserDao implements IUserDao {
    @Override
    public void save() {
        Log.d("UserDao", "-------- 数据已保存");
    }
}
