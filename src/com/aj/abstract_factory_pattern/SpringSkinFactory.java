package com.aj.abstract_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-11 14:17
 */

/**
 * Spring皮肤工厂：具体工厂
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        System.out.println("创建Spring皮肤的Button");
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("创建Spring皮肤的TextField");
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("创建Spring皮肤的ComboBox");
        return new SpringComboBox();
    }
}
