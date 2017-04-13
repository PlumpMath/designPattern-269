package com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Decorator;

import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Component;

/**
 * ScrollBarDecorator
 *
 * @Desc 滚动条装饰类：具体装饰类
 * @Author Wang Peng
 * @Date 2017/4/12 15:05
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
