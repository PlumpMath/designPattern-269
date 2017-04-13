package com.wp.personal.SevenStructuralPatterns.BridgePattern.Imp;

import com.wp.personal.SevenStructuralPatterns.BridgePattern.Matrix;

/**
 * WindowsImp
 *
 * @Desc Windows操作系统实现类：具体实现类
 * @Author Wang Peng
 * @Date 2017/4/11 17:31
 */
public class WindowsImp implements ImageImp {

    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.print("在Windows操作系统中显示图像：");
    }
}
