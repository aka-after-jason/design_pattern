package com.aj.singleton;

/**
 * @author aka_after_jason
 * @date 2020-11-12 10:26
 */

/**
 * 饿汉式单例类
 *
 * 在类被加载时，静态变量 instance 会被初始化，此时类的私有构造函数会被调用，
 * 单例类的唯一实例将被创建。
 */
public class EagerSingleton {

    // 在类被加载时就创建实例对象
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    // 提供外部使用的方法
    public static EagerSingleton getInstance() {
        return instance;
    }
}
