package com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern.Factory;

import com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern.Entity.Chart;
import com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern.Entity.HistogramChart;
import com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern.Entity.LineChart;
import com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern.Entity.PieChart;

/**
 * ChartFactory
 *
 * @Desc 图标工厂类：工厂类
 * @Author Wang Peng
 * @Date 2017/4/10 17:26
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");
        }
        return chart;
    }
}
