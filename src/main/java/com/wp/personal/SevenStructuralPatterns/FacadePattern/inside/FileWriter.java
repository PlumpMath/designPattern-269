package com.wp.personal.SevenStructuralPatterns.FacadePattern.inside;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * FileWriter
 *
 * @Desc 文件保存类，充当子系统类
 * @Author Wang Peng
 * @Date 2017/4/13 10:51
 */
public class FileWriter {
    public void Write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文，写入文件。");
        PrintWriter fs = null;
        try {
            fs = new PrintWriter(new FileOutputStream(fileNameDes));
            fs.println(encryptStr);
            fs.flush();
            fs.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        }
    }
}
