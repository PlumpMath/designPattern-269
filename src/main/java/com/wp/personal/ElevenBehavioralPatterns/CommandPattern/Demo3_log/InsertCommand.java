package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo3_log;

/**
 * InsertCommand
 *
 * @Desc 增加命令类：具体命令
 * @Author Wang Peng
 * @Date 2017/4/21 15:34
 */
public class InsertCommand extends Command {
    public InsertCommand(String name) {
        super(name);
    }

    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }

    public void execute() {
        configOperator.insert(this.args);
    }
}
