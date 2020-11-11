package com.aj.abstract_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-11 14:26
 */

/**
 * SummerTextField类：具体产品
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅蓝色的TextField");
    }
}
