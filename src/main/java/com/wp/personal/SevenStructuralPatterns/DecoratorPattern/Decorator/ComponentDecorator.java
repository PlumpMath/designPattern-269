package com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Decorator;

import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Component;

/**
 * ComponentDecorator
 *
 * @Desc 构件装饰类：抽象装饰类
 * @Author Wang Peng
 * @Date 2017/4/12 15:01
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}
