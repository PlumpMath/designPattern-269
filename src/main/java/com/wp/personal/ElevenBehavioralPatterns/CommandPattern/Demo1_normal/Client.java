package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo1_normal;

/**
 * Client
 *
 * @Desc 客户端——命令模式
 * @Author Wang Peng
 * @Date 2017/4/20 17:24
 */
public class Client {
    public static void main(String[] args) {
        FBsettingWindow fbsw = new FBsettingWindow("功能键设置");

        FunctionButton fb1, fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        Command cmd1, cmd2;
        cmd1 = new HelpCommand();
        cmd2 = new MinimizeCommand();

        fb1.setCommand(cmd1);
        fb2.setCommand(cmd2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();


    }

}
