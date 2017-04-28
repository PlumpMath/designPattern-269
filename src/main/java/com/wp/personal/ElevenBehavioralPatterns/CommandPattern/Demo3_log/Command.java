package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo3_log;

import java.io.Serializable;

/**
 * Command
 *
 * @Desc 抽象命令类，由于需要将命令对象写入文件，因此它实现了Serializable接口
 * @Author Wang Peng
 * @Date 2017/4/21 15:29
 */
public abstract class Command implements Serializable {
    protected String name;//命令名称
    protected String args;//名称参数
    protected ConfigOperator configOperator; //维持对接收者对象的引用

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    //声明两个抽象的执行方法execute()
    public abstract void execute(String args);

    public abstract void execute();
}
