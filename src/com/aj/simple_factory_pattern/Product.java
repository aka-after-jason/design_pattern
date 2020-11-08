package com.aj.simple_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-08 16:17
 */

/**
 * 抽象产品类
 */
public abstract class Product {

    // 所有产品类的公共业务方法都在这个抽象类中定义

    public void publicMethod(){
        // 公共方法的实现
    }

    // 声明抽象业务方法
    public abstract void methodDiff();
}
