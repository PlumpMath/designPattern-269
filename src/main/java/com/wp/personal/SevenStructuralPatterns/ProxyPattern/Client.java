package com.wp.personal.SevenStructuralPatterns.ProxyPattern;

import com.wp.personal.SevenStructuralPatterns.ProxyPattern.Proxy.ProxySearcher;

/**
 * Client
 *
 * @Desc 客户端——代理模式
 * @Author Wang Peng
 * @Date 2017/4/13 16:56
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        String result = searcher.DoSearch("杨过", "玉女心经");
    }
}
