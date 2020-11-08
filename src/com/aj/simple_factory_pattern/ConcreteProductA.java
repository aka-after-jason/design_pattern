package com.aj.simple_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-08 16:20
 */

/**
 * 具体产品类
 */
public class ConcreteProductA extends Product {

    // 实现业务方法
    @Override
    public void methodDiff() {
        System.out.println("我是具体的产品类A");
    }
}
