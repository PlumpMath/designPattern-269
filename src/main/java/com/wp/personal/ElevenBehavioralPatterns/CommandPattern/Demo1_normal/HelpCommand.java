package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo1_normal;

/**
 * HelpCommand
 *
 * @Desc 帮助命令类：具体命令类
 * @Author Wang Peng
 * @Date 2017/4/20 17:16
 */
public class HelpCommand extends Command {

    private HelpHandler hhObj;//维持对请求接收者的引用

    public HelpCommand() {
        this.hhObj = new HelpHandler();
    }

    //命令执行方法，将调用请求接收者的业务方法
    public void execute() {
        hhObj.display();
    }
}
