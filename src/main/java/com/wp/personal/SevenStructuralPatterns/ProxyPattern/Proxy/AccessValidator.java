package com.wp.personal.SevenStructuralPatterns.ProxyPattern.Proxy;

/**
 * AccessValidator
 *
 * @Desc 身份验证类，业务类，它提供方法Validate()来实现身份验证
 * @Author Wang Peng
 * @Date 2017/4/13 16:57
 */
public class AccessValidator {
    /**
     * @param userId
     * @return
     * @Desc 模拟实现登录验证
     * @Author Wang Peng
     * @Date 2017/4/13 17:00
     */
    public boolean Validate(String userId) {
        System.out.println("在数据库中验证用户'" + userId + "'是否是合法用户？");
        if (userId.equals("杨过")) {
            System.out.println(userId + "登录成功！");
            return true;
        } else {
            System.out.println(userId + "登录失败！");
            return false;
        }
    }
}
