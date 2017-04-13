package com.wp.personal.SevenStructuralPatterns.BridgePattern.Image;

import com.wp.personal.SevenStructuralPatterns.BridgePattern.Matrix;

/**
 * PNGImage
 *
 * @Desc PNG格式图像：扩充抽象类
 * @Author Wang Peng
 * @Date 2017/4/11 17:42
 */
public class PNGImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为PNG。");
    }
}
