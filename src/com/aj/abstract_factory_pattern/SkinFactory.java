package com.aj.abstract_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-11 14:16
 */

/**
 * 界面皮肤工厂接口：抽象工厂
 */
public interface SkinFactory {
    // 创建Button的接口
    Button createButton();
    // 创建TextField的接口
    TextField createTextField();
    // 创建ComboBox的接口
    ComboBox createComboBox();
}
