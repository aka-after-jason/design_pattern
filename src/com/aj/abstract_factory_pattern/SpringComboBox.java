package com.aj.abstract_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-11 14:31
 */

/**
 * SpringComboBox类：具体产品
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示浅绿色的ComboBox");
    }
}
