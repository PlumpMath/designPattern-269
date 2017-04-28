package com.wp.personal.ElevenBehavioralPatterns.InterpreterPattern;

/**
 * Client
 *
 * @Desc 客户端——解释器模式
 * @Author Wang Peng
 * @Date 2017/4/28 17:19
 */
public class Client {
    public static void main(String args[]) {
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString;
        outString = handler.output();
        System.out.println(outString);
    }
}
