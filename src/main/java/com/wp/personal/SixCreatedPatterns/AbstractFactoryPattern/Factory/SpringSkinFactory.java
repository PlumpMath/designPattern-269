package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Factory;

import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity.*;

/**
 * SpringSkinFactory
 *
 * @Desc Spring皮肤工厂：具体工厂
 * @Author Wang Peng
 * @Date 2017/4/11 10:42
 */
public class SpringSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }

    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
