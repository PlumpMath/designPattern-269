package com.wp.personal.SevenStructuralPatterns.FacadePattern.facade;

import com.wp.personal.SevenStructuralPatterns.FacadePattern.inside.CipherMachine;
import com.wp.personal.SevenStructuralPatterns.FacadePattern.inside.FileReader;
import com.wp.personal.SevenStructuralPatterns.FacadePattern.inside.FileWriter;

/**
 * EncryptFacade
 *
 * @Desc 加密外观类，充当外观类
 * @Author Wang Peng
 * @Date 2017/4/13 10:46
 */
public class EncryptFacade extends AbstractEncryptFacade {
    //维持对其他对象的引用
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    //调用其他对象的业务方法
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.Read(fileNameSrc);
        String encryptStr = cipher.Encrypt(plainStr);
        writer.Write(encryptStr, fileNameDes);
    }
}
