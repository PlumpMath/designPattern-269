package com.wp.personal.SevenStructuralPatterns.BridgePattern.Image;

import com.wp.personal.SevenStructuralPatterns.BridgePattern.Imp.ImageImp;

/**
 * Image
 *
 * @Desc 抽象图像类：抽象类
 * @Author Wang Peng
 * @Date 2017/4/11 17:19
 */
public abstract class Image {
    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
