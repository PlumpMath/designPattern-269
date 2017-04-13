package com.wp.personal.SevenStructuralPatterns.ProxyPattern.Proxy;

/**
 * Logger
 *
 * @Desc 日志记录类，业务类，它提供方法Log()来保存日志
 * @Author Wang Peng
 * @Date 2017/4/13 17:01
 */
public class Logger {
    /**
     * @param userId
     * @Desc 模拟实现日志记录
     * @Author Wang Peng
     * @Date 2017/4/13 17:07
     */
    public void Log(String userId) {
        System.out.println("更新数据库，用户" + userId + "查询次数加1！");
    }
}
