package com.aj.abstract_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-11 13:59
 */

/**
 * 工厂三兄弟之抽象工厂模式(Abstract Factory Pattern)
 *
 * 概述：
 * 抽象工厂模式为创建一组对象提供了一种解决方法。与工厂方法模式相比，抽象工厂模式的具体工厂不只是创建一种产品，
 * 它负责创建一族产品。
 *
 * 定义：
 * 抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口，而无须指定他们具体的类。
 * 抽象工厂模式又称为Kit模式，它是一种对象创建型模式
 *
 * 在抽象工厂模式中，每一个具体工厂都提供了多个工厂方法用于产生多种不同类型的产品，这些产品构成了一个产品族
 *
 * 在抽象工厂模式结构图中包含了如下几个角色：
 * AbstractFactory(抽象工厂)：它声明了一组用于创建一族产品的方法，每一个方法对应一种产品
 * ConcreteFactory(具体工厂)：它实现了抽象工厂中声明的创建产品的方法，生成一组具体的产品，这些产品构成了一个产品族，
 *                           每一个产品都位于某个产品等级结构中。
 * AbstractProduct(抽象产品)：它为每种产品声明接口，在抽象产品中声明了产品所具有的业务方法
 * ConcreteProduct(具体产品)：它定义具体工厂生产的具体产品对象，实现抽象产品接口中声明的业务方法
 *
 * 在抽象工厂中声明了多个工厂方法，用于创建不同类型的产品，抽象工厂可以是接口，也可以是抽象类或者具体类。
 *
 * 与工厂方法模式一样，抽象工厂模式也可以为每一种产品提供一组重载的工厂方法，以不同的方法对产品对象进行创建。
 */

import com.aj.tools.XMLUtil;

/**
 * 抽象工厂模式的测试类
 */
public class Abstract_Factory_Introduce {
    public static void main(String[] args) {
        System.out.println("============抽象工厂模式的使用：============");

        // 使用抽象层定义
        SkinFactory factory;
        Button button;
        factory = (SkinFactory) XMLUtil.getBean();//new SummerSkinFactory(); // 这里可以通过读取配置文件来替换使用 new 关键字来创建
        button = factory.createButton();
        button.display();

        // TextField
        TextField textField;
        textField = factory.createTextField();
        textField.display();

        // ComboBox
        ComboBox comboBox;
        comboBox = factory.createComboBox();
        comboBox.display();
    }
}

/**
 * 抽象工厂模式的总结：
 *
 * "开闭原则"的倾斜性
 * 这也是抽象工厂模式最大的缺点。在抽象工厂模式中，增加新的产品族很方便，但是增加新的产品等级结构很麻烦，
 * 抽象工厂模式的这种性质称为"开闭原则"的倾斜性。"开闭原则"要求系统对扩展开发，对象修改封闭，通过扩展达到增强其功能的目的，对于
 * 设计到多个产品族与多个产品等级结构的系统，其功能增强包括两个方面：
 *      1. 增加产品族
 *      2. 增加产品等级结构
 *
 * 抽象工厂模式是工厂方法模式的进一步延伸，由于它提供了功能强大的工厂类并且具备较好的可扩展性，在软件开发中得以广泛应用，
 * 尤其是在一些框架和API类库的设计中。
 *
 */
