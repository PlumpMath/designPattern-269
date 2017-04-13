package com.wp.personal.SevenStructuralPatterns.FacadePattern;

import com.wp.personal.SevenStructuralPatterns.FacadePattern.facade.AbstractEncryptFacade;
import com.wp.personal.SevenStructuralPatterns.FacadePattern.facade.EncryptFacade;

/**
 * Client
 *
 * @Desc 客户端——外观模式
 * @Author Wang Peng
 * @Date 2017/4/13 11:03
 */
public class Client {
    public static void main(String[] args) {
        AbstractEncryptFacade ef; //针对抽象外观类编程
        ef = new EncryptFacade();
        ef.fileEncrypt("src.txt", "des.txt");
    }
}
