package com.jsj.designpatterns.singleton;

/**
 * Created by jiangshujing on 2018/2/26.
 * 枚举单例
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，
 * 而且还能防止反序列化重新创建新的对象。
 *
 * 默认枚举实例的创建是线程安全的，并且在任何情况下它都是一个单例，上面集中单例模式，在反序列化情况下是会
 * 重新创建对象的，即便构造方法是私有的，反序列化时依旧可以通过特殊的途径去创建类的一个新的实例，
 * 相当于调用该类的构造函数。
 *
 * 知识扩展：反序列化操作提供了一个很特别的钩子函数，类中具有一个私有的，被实例化的方法readResolve(),
 * 这个方法可以让开发人员控制对象的反序列化，例如，上述几个示例中如果要杜绝单例对象在被反序列化时重新
 * 生成对象，那么必须加入如下方法：
 *  private Object readResolve() throws ObjectStreamException {
        return instance;
    }
 *  也就是在readResolve()方法中将instance对象返回，而不是默认的重新生成一个新的对象，而对于枚举，并不存
 *  在这个问题，因为即使是反序列化他也不会重新生成新的实例
 *
 */

public enum EnumSingleton {
    /**
     * 定义一个枚举的元素，它就代表了Singleton的一个实例
     */
    INSTANCE;


    public void whateverMethod() {

    }
}
