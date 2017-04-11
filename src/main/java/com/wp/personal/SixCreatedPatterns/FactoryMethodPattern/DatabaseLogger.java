package com.wp.personal.SixCreatedPatterns.FactoryMethodPattern;

/**
 * DatabaseLogger
 *
 * @Desc 数据库日志记录器：具体产品
 * @Author Wang Peng
 * @Date 2017/4/11 10:10
 */
public class DatabaseLogger implements Logger {

    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
