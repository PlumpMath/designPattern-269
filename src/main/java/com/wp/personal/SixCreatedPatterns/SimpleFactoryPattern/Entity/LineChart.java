package com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern.Entity;

/**
 * LineChart
 *
 * @Desc 折线图类：具体产品类
 * @Author Wang Peng
 * @Date 2017/4/10 17:24
 */
public class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建折线图！");
    }

    public void display() {
        System.out.println("显示折线图！");
    }
}
