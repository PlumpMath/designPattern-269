package com.wp.personal.SixCreatedPatterns.SingletonPattern;

/**
 * IoDHSingleton
 *
 * @Desc Initialization Demand Holder (IoDH)单例
 * 通过使用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式
 * （其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）
 * @Author Wang Peng
 * @Date 2017/4/11 11:47
 */
public class IoDHSingleton {
    private IoDHSingleton() {
    }

    private static class HolderClass {
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDHSingleton s1, s2;
        s1 = IoDHSingleton.getInstance();
        s2 = IoDHSingleton.getInstance();
        System.out.println(s1 == s2);
    }

}
