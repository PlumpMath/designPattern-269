package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity;

/**
 * SpringComboBox
 *
 * @Desc Spring组合框类：具体产品
 * @Author Wang Peng
 * @Date 2017/4/11 10:38
 */
public class SpringComboBox implements ComboBox {
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}
