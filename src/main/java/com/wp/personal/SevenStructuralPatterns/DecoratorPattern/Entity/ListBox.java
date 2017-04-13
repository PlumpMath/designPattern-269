package com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Entity;

import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Component;

/**
 * ListBox
 *
 * @Desc 列表框类：具体构件类
 * @Author Wang Peng
 * @Date 2017/4/12 14:59
 */
public class ListBox extends Component {
    public void display() {
        System.out.println("显示列表框！");
    }
}
