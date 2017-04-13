package com.wp.personal.SevenStructuralPatterns.BridgePattern.Imp;

import com.wp.personal.SevenStructuralPatterns.BridgePattern.Matrix;

/**
 * UnixImp
 *
 * @Desc Unix操作系统实现类：具体实现类
 * @Author Wang Peng
 * @Date 2017/4/11 17:34
 */
public class UnixImp implements ImageImp {
    public void doPaint(Matrix m) {
        //调用Unix系统的绘制函数绘制像素矩阵
        System.out.print("在Unix操作系统中显示图像：");
    }
}
