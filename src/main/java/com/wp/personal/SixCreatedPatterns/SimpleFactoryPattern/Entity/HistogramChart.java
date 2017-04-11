package com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern.Entity;

/**
 * HistogramChart
 *
 * @Desc 柱状图类：具体产品类
 * @Author Wang Peng
 * @Date 2017/4/10 16:58
 */
public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    public void display() {
        System.out.println("显示柱状图");
    }

}
