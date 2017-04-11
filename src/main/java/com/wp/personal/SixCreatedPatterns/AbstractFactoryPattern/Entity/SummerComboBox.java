package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity;

/**
 * SummerComboBox
 *
 * @Desc Summer组合框类：具体产品
 * @Author Wang Peng
 * @Date 2017/4/11 10:39
 */
public class SummerComboBox implements ComboBox {
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}
