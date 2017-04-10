package com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern;

/**
 * PieChart
 *
 * @Desc 饼状图类：具体产品类
 * @Author Wang Peng
 * @Date 2017/4/10 17:14
 */
public class PieChart implements Chart{

    public PieChart() {
        System.out.println("创建饼状图！");
    }

    public void display() {
        System.out.println("显示饼状图！");
    }
}
