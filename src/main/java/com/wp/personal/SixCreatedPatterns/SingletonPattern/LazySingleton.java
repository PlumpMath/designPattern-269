package com.wp.personal.SixCreatedPatterns.SingletonPattern;

/**
 * LazySingleton
 *
 * @Desc 懒汉式单例（双重检查锁定）
 * @Author Wang Peng
 * @Date 2017/4/11 11:35
 */
public class LazySingleton {
    // 被volatile修饰的成员变量可以确保多个线程都能够正确处理
    // 线程能够自动发现 volatile 变量的最新值
    private volatile static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton();//创建单例实例
                }
            }
        }
        return instance;
    }
}
