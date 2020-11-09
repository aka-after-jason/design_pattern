package com.aj.simple_factory_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-09 15:48
 */

/**
 * 饼状图类：具体的产品类
 */
public class PieChart implements Chart {

    // 添加构造方法
    public PieChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
