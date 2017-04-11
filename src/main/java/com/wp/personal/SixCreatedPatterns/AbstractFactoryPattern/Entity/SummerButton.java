package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity;

/**
 * SummerButton
 *
 * @Desc Summer按钮类：具体产品
 * @Author Wang Peng
 * @Date 2017/4/11 10:33
 */
public class SummerButton implements Button {
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}
