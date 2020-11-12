package com.aj.singleton;

/**
 * @author aka_after_jason
 * @date 2020-11-12 10:10
 */

/**
 * 单利模式(Singleton Pattern)：
 *
 * 定义：
 * 确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类被称为单利类，它提供全局访问的方法。
 * 单例模式是一种对象创建型模式
 *
 * 单例模式有三个要点：
 * 1. 某个类只能有一个实例
 * 2. 必须自行创建这个实例
 * 3. 必须自行向整个系统提供这个实例
 *
 * 单例模式结构图中只包含一个单例角色：
 * Singleton(单例)：在单例类的内部实现只生成一个实例，同时提供一个静态的 getInstance()工厂方法，
 *                 让客户可以访问它的唯一实例；为了防止在外部对其实例化，将其构造函数设计为私有；
 *                 在单例类内部定义了一个Singleton类型的静态对象，作为外部共享的唯一实例。
 *
 *
 * 1. 饿汉式单利类
 * 2. 懒汉式单利类
 * 3. 一种更好的单例实现方法(Initialization on Demand Holder)(IoDH)技术
 *      在IoDH中，我们在单例类内部增加一个静态内部类，在该内部类中创建单例对象，再将该单例对象通过 getInstance()方法返回给外部使用.
 *      通过使用 IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的java语言单例模式实现方式。
 *      (其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH)
 *
 *
 * 饿汉式单利类与懒汉式单利类的比较
 * a. 饿汉式单例类在被加载时就将自己实例化，它的优点在于无须考虑多线程访问问题，可以确保实例的唯一性；
 *    从调用速度和反映时间角度来讲，由于单例对象一开始就得以创建，因此要优于懒汉式单例。
 *    但是无论系统在运行时是否需要使用该单例对象，由于在类加载时对象就需要创建，因此从资源利用效率角度来讲，
 *    饿汉式单例不及懒汉式单例
 *
 * b. 懒汉式单例类在第一次使用时创建，无须一直占用系统资源，实现了延迟加载，但是必须处理好多个线程同时访问的问题，
 *    特别是当单例类作为资源控制器，在实例化时必然涉及资源初始化，而资源初始化很有可能耗费大量时间，这意味着出现多线程
 *    同时首次引用此类的几率变得较大，需要通过双重检查锁定等机制进行控制，这将导致系统性能受到一定影响
 *
 */
public class Singleton_Introduce {

    public static void main(String[] args) {
        // 饿汉式单例类
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1 == eagerSingleton2);

        // 懒汉式单例类
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1 == lazySingleton2);

        // IoDH
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}
