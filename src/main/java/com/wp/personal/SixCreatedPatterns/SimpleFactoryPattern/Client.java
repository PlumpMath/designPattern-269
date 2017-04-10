package com.wp.personal.SixCreatedPatterns.SimpleFactoryPattern;

/**
 * Client
 *
 * @Desc 客户端
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
