package com.aj.abstract_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-11 14:32
 */

/**
 * SummerComboBox类：具体产品类
 */
public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示浅蓝色的ComboBox");
    }
}
