package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Factory;

import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity.Button;
import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity.ComboBox;
import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity.TextField;

/**
 * SkinFactory
 *
 * @Desc 界面皮肤工厂接口：抽象工厂
 * @Author Wang Peng
 * @Date 2017/4/11 10:40
 */
public interface SkinFactory {
    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();
}
