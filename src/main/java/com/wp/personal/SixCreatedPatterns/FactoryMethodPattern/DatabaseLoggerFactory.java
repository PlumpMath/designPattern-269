package com.wp.personal.SixCreatedPatterns.FactoryMethodPattern;

/**
 * DatabaseLoggerFactory
 *
 * @Desc 数据库日志记录器工厂类：具体工厂
 * @Author Wang Peng
 * @Date 2017/4/11 10:14
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器
        return logger;
    }
}
