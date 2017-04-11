package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern;

import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity.Button;
import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity.ComboBox;
import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity.TextField;
import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Factory.SkinFactory;
import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Factory.SpringSkinFactory;

/**
 * Client
 *
 * @Desc 客户端——抽象工厂模式
 * @Author Wang Peng
 * @Date 2017/4/11 10:56
 */
public class Client {
    public static void main(String[] args) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = new SpringSkinFactory();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
