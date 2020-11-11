package com.aj.abstract_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-11 14:24
 */

/**
 * SpringTextField类：具体产品类
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅绿色的TextField");
    }
}
