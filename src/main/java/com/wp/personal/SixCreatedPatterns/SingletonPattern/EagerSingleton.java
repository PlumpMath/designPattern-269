package com.wp.personal.SixCreatedPatterns.SingletonPattern;

/**
 * EagerSingleton
 *
 * @Desc 饿汉式单例
 * @Author Wang Peng
 * @Date 2017/4/11 11:32
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
