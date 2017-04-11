package com.wp.personal.SixCreatedPatterns.PrototypePattern.PrototypeManager;

/**
 * FAR
 *
 * @Desc 可行性分析报告（Feasibility Analysis Report）类
 * @Author Wang Peng
 * @Date 2017/4/11 14:27
 */
public class FAR implements OfficialDocument {
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持复制！");
        }
        return far;
    }

    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
