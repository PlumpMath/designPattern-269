package com.wp.personal.SevenStructuralPatterns.ProxyPattern.Real;

import com.wp.personal.SevenStructuralPatterns.ProxyPattern.Searcher;

/**
 * RealSearcher
 *
 * @Desc 具体查询类，充当真实主题角色，它实现查询功能，提供方法DoSearch()来查询信息。
 * @Author Wang Peng
 * @Date 2017/4/13 17:19
 */
public class RealSearcher implements Searcher {
    /**
     * @param userId
     * @param keyword
     * @return
     * @Desc 模拟查询商务信息
     * @Author Wang Peng
     * @Date 2017/4/13 17:20
     */
    public String DoSearch(String userId, String keyword) {
        System.out.println("用户" + userId + "使用关键词" + keyword + "查询商务信息！");
        return "返回具体内容";
    }
}
