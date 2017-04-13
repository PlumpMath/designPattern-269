package com.wp.personal.SevenStructuralPatterns.BridgePattern.Imp;

import com.wp.personal.SevenStructuralPatterns.BridgePattern.Matrix;

/**
 * ImageImp
 *
 * @Desc 抽象操作系统实现类：实现类接口
 * @Author Wang Peng
 * @Date 2017/4/11 17:23
 */
public interface ImageImp {
    public void doPaint(Matrix m); //显示像素矩阵m
}
