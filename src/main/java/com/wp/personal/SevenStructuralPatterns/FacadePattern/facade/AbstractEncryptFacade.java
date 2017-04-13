package com.wp.personal.SevenStructuralPatterns.FacadePattern.facade;

/**
 * AbstractEncryptFacade
 *
 * @Desc 抽象外观类
 * @Author Wang Peng
 * @Date 2017/4/13 11:06
 */
public abstract class AbstractEncryptFacade {
    public abstract void fileEncrypt(String fileNameSrc, String fileNameDes);
}
