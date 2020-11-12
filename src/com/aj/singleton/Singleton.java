package com.aj.singleton;

/**
 * @author aka_after_jason
 * @date 2020-11-12 10:42
 */

/**
 * Initialization on Demand Holder(IoDH技术)
 */
public class Singleton {

    private Singleton(){}

    private static class HolderClass {
        private final static Singleton instance = new Singleton();
    }
    // 提供外部使用的方法
    public static Singleton getInstance() {
        return HolderClass.instance;
    }

}
