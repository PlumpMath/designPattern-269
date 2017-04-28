package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo3_log;

/**
 * ModifyCommand
 *
 * @Desc 修改命令类：具体命令
 * @Author Wang Peng
 * @Date 2017/4/21 15:36
 */
public class ModifyCommand extends Command {
    public ModifyCommand(String name) {
        super(name);
    }

    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    public void execute() {
        configOperator.modify(this.args);
    }
}
