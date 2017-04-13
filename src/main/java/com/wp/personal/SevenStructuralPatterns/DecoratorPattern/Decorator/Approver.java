package com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Decorator;

import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Component;

/**
 * Approver
 *
 * @Desc 具体装饰类，半透明装饰模式
 * @Author Wang Peng
 * @Date 2017/4/12 15:19
 */
public class Approver extends ComponentDecorator {
    public Approver(Component component) {
        super(component);
    }

    public void approve() {
        System.out.println("审批文件！");
    }
}
