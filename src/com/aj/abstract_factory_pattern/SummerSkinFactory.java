package com.aj.abstract_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-11 14:19
 */

/**
 * Summer皮肤的工厂：具体工厂
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        System.out.println("创建Summer皮肤的Button");
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("创建Summer皮肤的TextField");
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("创建Summer皮肤的ComboBox");
        return new SummerComboBox();
    }
}
