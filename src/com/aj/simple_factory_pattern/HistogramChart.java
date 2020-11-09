package com.aj.simple_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-09 15:45
 */

/**
 * 柱状图类：具体产品类
 */
public class HistogramChart implements Chart {

    // 添加构造方法
    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    // 实现接口中的方法
    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
