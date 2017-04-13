package com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Entity;

import com.wp.personal.SevenStructuralPatterns.DecoratorPattern.Component;

/**
 * TextBox
 *
 * @Desc 文本框类：具体构件类
 * @Author Wang Peng
 * @Date 2017/4/12 14:58
 */
public class TextBox extends Component {

    public void display() {
        System.out.println("显示文本框！");
    }
}
