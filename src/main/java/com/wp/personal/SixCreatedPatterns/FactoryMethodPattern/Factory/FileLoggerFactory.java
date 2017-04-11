package com.wp.personal.SixCreatedPatterns.FactoryMethodPattern.Factory;

import com.wp.personal.SixCreatedPatterns.FactoryMethodPattern.Entity.FileLogger;
import com.wp.personal.SixCreatedPatterns.FactoryMethodPattern.Entity.Logger;

/**
 * FileLoggerFactory
 *
 * @Desc 文件日志记录器工厂类：具体工厂
 * @Author Wang Peng
 * @Date 2017/4/11 10:18
 */
public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
