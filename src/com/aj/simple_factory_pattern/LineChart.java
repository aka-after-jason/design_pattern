package com.aj.simple_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-09 15:49
 */

/**
 * 折线图类： 具体的产品类
 */
public class LineChart implements Chart {

    // 构造方法
    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
