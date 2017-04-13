package com.wp.personal.SevenStructuralPatterns.BridgePattern;

import com.wp.personal.SevenStructuralPatterns.BridgePattern.Image.Image;
import com.wp.personal.SevenStructuralPatterns.BridgePattern.Image.JPGImage;
import com.wp.personal.SevenStructuralPatterns.BridgePattern.Imp.ImageImp;
import com.wp.personal.SevenStructuralPatterns.BridgePattern.Imp.WindowsImp;

/**
 * Client
 *
 * @Desc 客户端——桥接模式
 * @Author Wang Peng
 * @Date 2017/4/11 17:49
 */
public class Client {
    public static void main(String[] args) {
        Image image = new JPGImage();
        ImageImp imp = new WindowsImp();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
