package com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Factory;

import com.wp.personal.SixCreatedPatterns.AbstractFactoryPattern.Entity.*;

/**
 * SummerSkinFactory
 *
 * @Desc Summer皮肤工厂：具体工厂
 * @Author Wang Peng
 * @Date 2017/4/11 10:46
 */
public class SummerSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
