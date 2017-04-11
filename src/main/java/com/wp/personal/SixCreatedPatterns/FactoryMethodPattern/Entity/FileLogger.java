package com.wp.personal.SixCreatedPatterns.FactoryMethodPattern.Entity;

/**
 * FileLogger
 *
 * @Desc 文件日志记录器：具体产品
 * @Author Wang Peng
 * @Date 2017/4/11 10:11
 */
public class FileLogger implements Logger {

    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
