package com.aj.simple_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-08 16:21
 */

/**
 * 工厂类
 * 简单工厂模式的核心
 */
public class Factory {

    // 提供静态工厂方法
    public static Product getProduct(String org) {
        Product product = null;
        if (org.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            // 初始化设置 product
        }else if (org.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            // 初始化设置 product
        }
        return product;
    }
}
