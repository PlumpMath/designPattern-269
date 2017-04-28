package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo2_undo;

/**
 * AbstractCommand
 *
 * @Desc 抽象命令类
 * @Author Wang Peng
 * @Date 2017/4/21 10:38
 */
public abstract class AbstractCommand {
    public abstract int execute(int value);//声明命令执行方法execute()

    public abstract int undo();//声明撤销方法undo();
}
