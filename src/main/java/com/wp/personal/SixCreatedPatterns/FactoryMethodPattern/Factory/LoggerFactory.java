package com.wp.personal.SixCreatedPatterns.FactoryMethodPattern.Factory;

import com.wp.personal.SixCreatedPatterns.FactoryMethodPattern.Entity.Logger;

/**
 * LoggerFactory
 *
 * @Desc 日志记录器工厂接口：抽象工厂
 * @Author Wang Peng
 * @Date 2017/4/11 10:13
 */
public interface LoggerFactory {
    public Logger createLogger();
}
