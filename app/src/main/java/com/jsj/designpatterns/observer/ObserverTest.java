package com.jsj.designpatterns.observer;

/**
 * Created by jiangshujing on 2017/11/3.
 */

public class ObserverTest {

    public static void test() {
        //创建微信公众号
        CsdnWeixinSubject subject = new CsdnWeixinSubject();
        //创建订阅用户
        WeixinUser user1 = new WeixinUser("xiaoxiao");
        WeixinUser user2 = new WeixinUser("dada");
        //用户订阅公众号
        subject.add(user1);
        subject.add(user2);
        //订阅号发送消息
        subject.notify("欢迎大家订阅csdn");
    }
}
