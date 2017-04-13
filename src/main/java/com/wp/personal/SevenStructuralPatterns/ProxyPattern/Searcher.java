package com.wp.personal.SevenStructuralPatterns.ProxyPattern;

/**
 * Searcher
 *
 * @Desc 抽象查询类，充当抽象主题角色，它声明了DoSearch()方法。
 * @Author Wang Peng
 * @Date 2017/4/13 17:18
 */
public interface Searcher {
    String DoSearch(String userId, String keyword);
}
