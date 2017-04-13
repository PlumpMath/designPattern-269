package com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Entity;

import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Component;

/**
 * Window
 *
 * @Desc 窗体类：具体构件类
 * @Author Wang Peng
 * @Date 2017/4/12 14:56
 */
public class Window extends Component {
    public void display() {
        System.out.println("显示窗体！");
    }
}
