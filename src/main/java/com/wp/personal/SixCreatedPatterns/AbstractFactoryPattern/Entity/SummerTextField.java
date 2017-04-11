package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity;

/**
 * SummerTextField
 *
 * @Desc Summer文本框类：具体产品
 * @Author Wang Peng
 * @Date 2017/4/11 10:36
 */
public class SummerTextField implements TextField {
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
