package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo1_normal;

import java.util.ArrayList;

/**
 * FBsettingWindow
 *
 * @Desc 功能键设置窗口类
 * @Author Wang Peng
 * @Date 2017/4/20 16:44
 */
public class FBsettingWindow {
    private String title;//窗口标题
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBsettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }

    //显示窗口及功能键
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (Object obj : functionButtons) {
            System.out.println(((FunctionButton) obj).getName());
        }
        System.out.println("------------------------------");
    }
}
