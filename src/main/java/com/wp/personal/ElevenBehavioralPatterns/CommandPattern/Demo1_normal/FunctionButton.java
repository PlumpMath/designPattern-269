package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo1_normal;

/**
 * FunctionButton
 *
 * @Desc 功能键类：请求发送者
 * @Author Wang Peng
 * @Date 2017/4/20 16:46
 */
public class FunctionButton {
    private String name;//功能键名称
    private Command command;//维持一个抽象命令对象的引用

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //为功能键注入命令
    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        System.out.println("点击功能键；");
        command.execute();
    }

}
