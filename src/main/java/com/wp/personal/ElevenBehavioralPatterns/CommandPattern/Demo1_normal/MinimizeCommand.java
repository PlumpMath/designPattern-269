package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo1_normal;

/**
 * MinimizeCommand
 *
 * @Desc 最小化命令类：具体命令类
 * @Author Wang Peng
 * @Date 2017/4/20 17:04
 */
public class MinimizeCommand extends Command {
    private WindowHanlder whObj; //维持对请求接收者的引用

    public MinimizeCommand() {
        whObj = new WindowHanlder();
    }

    public void execute() {
        whObj.minimize();
    }
}
