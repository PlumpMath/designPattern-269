package com.wp.personal.SevenStructuralPatterns.DecoratorPattern;

import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Decorator.Approver;
import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Decorator.BlackBorderDecorator;
import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Decorator.ScrollBarDecorator;
import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Entity.Window;

/**
 * Client
 *
 * @Desc 客户端——装饰模式
 * @Author Wang Peng
 * @Date 2017/4/12 15:17
 */
public class Client {
    public static void main(String[] args) {
        Component component, componentSB, componentBB; //全部使用抽象构件定义
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB); //将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
        componentBB.display();
        Approver componentAP = new Approver(component);
        componentAP.approve();
    }
}
