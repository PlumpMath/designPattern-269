package com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Decorator;

import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Component;

/**
 * BlackBorderDecorator
 *
 * @Desc 黑色边框装饰类：具体装饰类
 * @Author Wang Peng
 * @Date 2017/4/12 15:15
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}
