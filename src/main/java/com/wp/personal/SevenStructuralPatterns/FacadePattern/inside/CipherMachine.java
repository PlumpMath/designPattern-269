package com.wp.personal.SevenStructuralPatterns.FacadePattern.inside;

/**
 * CipherMachine
 *
 * @Desc 数据加密类，充当子系统类
 * @Author Wang Peng
 * @Date 2017/4/13 10:46
 */
public class CipherMachine {
    public String Encrypt(String plainText) {
        System.out.println("数据加密，将明文转换为密文：");
        String es = "";
        char[] chars = plainText.toCharArray();
        for (char ch : chars) {
            String c = String.valueOf(ch % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }
}
