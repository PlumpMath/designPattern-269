package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity;

/**
 * SpringButton
 *
 * @Desc Spring按钮类：具体产品
 * @Author Wang Peng
 * @Date 2017/4/11 10:32
 */
public class SpringButton implements Button {
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
