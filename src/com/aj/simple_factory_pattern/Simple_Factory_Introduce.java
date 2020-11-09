package com.aj.simple_factory_pattern;

/**
 * 简单工厂模式(Simple Factory Pattern)
 *      简单工厂模式的介绍：
 *      定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常具有共同的父类。
 *      因为在简单工厂模式中用于创建实例的方法是静态(static)方法，因此简单工厂模式又被称为静态工厂方法(Static Factory Method)模式，
 *      它属于类创建型模式
 *
 *
 *      在抽象工厂模式结构图中包含如下几个角色：
 *
 *      Factory(工厂角色)：工厂角色即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑；
 *                        工厂类可以被外界直接调用，创建所需的产品对象；
 *                        在工厂类中提供静态的工厂方法 factoryMethod(), 它的返回类型为抽象产品类型 Product
 *
 *      Product(抽象产品角色)：它是工厂类所创建的所有对象的父类，封装了各种产品对象的公有方法，它的引入将提供系统的灵活性，
 *                           使得在工厂类中只需要定义一个通用的工厂方法，因为所有创建的具体产品对象都是其子类对象
 *
 *      ConcreteProduct(具体产品角色)：它是简单工厂模式的创建目标，所有被创建的对象都充当这个角色的某个具体类的实例。
 *                                   每一个具体产品角色都继承了抽象产品角色，需要实现在抽象产品中声明的方法。
 *
 *
 *      在简单工厂模式中，客户端通过工厂类来创建一个产品类的实例，而无需直接使用 new 关键字来创建对象，它是工厂模式家族中最简单的一员
 */
public class Simple_Factory_Introduce {

    public static void main(String[] args) {
//        Product product;
//        product = Factory.getProduct("B"); // 通过工厂类创建具体的产品对象
//        product.publicMethod();
//        product.methodDiff();

        // 创建chart对象
        Chart chart = null;
        chart = ChartFactory.getChart("line");
        chart.display();
    }
}
