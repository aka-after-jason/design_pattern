package com.aj.singleton;

/**
 * @author aka_after_jason
 * @date 2020-11-12 10:33
 */

/**
 * 懒汉式单例类
 */
public class LazySingleton {

    private volatile static LazySingleton instance = null;
    private LazySingleton(){}

    /**
     * 提供外部调用的方法
     * 这里使用了 双重检查锁定
     * 需要注意的是，如果使用了双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符 volatile
     * 被 volatile 修饰的成员变量可以确保多个线程能够正确处理
     * @return
     */
    public static LazySingleton getInstance() {
        // 第一重判断
        if (instance == null) {
            // 锁定代码块
            synchronized (LazySingleton.class) {
                // 第二重判断
                if (instance == null) {
                    instance = new LazySingleton(); // 创建单例对象
                }
            }
        }
        return instance;
    }
}
