package com.wp.personal.ElevenBehavioralPatterns.CommandPattern.Demo2_undo;

/**
 * Client
 *
 * @Desc 客户端——命令模式（撤销）
 * @Author Wang Peng
 * @Date 2017/4/21 15:18
 */
public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new ConcreteCommand();
        form.setCommand(command); //向发送者注入命令对象

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
