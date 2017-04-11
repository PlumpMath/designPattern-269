package com.wp.personal.SixCreatedPatterns.PrototypePattern.PrototypeManager;

/**
 * SRS
 *
 * @Desc 软件需求规格说明书（Software Requirements Specification）类
 * @Author Wang Peng
 * @Date 2017/4/11 14:31
 */
public class SRS implements OfficialDocument {
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return srs;
    }

    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
