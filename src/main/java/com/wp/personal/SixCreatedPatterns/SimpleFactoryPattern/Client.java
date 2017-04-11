package com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern;

import com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern.Entity.Chart;
import com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern.Factory.ChartFactory;

/**
 * Client
 *
 * @Desc 客户端——简单工厂模式
 * @Author Wang Peng
 * @Date 2017/4/10 17:30
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("pie");
        chart.display();
    }

}
