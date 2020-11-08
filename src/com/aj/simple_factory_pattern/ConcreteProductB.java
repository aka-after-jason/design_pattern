package com.aj.simple_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-08 16:24
 */

/**
 * 具体的产品类
 */
public class ConcreteProductB extends Product {

    @Override
    public void methodDiff() {
        System.out.println("我是具体的产品类B");
    }
}
