package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity;

/**
 * SpringTextField
 *
 * @Desc Spring文本框类：具体产品
 * @Author Wang Peng
 * @Date 2017/4/11 10:35
 */
public class SpringTextField implements TextField {
    public void display() {
        System.out.println("显示绿色边框文本。");
    }
}
