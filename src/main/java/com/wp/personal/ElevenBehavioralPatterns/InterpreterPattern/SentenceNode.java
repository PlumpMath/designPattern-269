package com.wp.personal.ElevenBehavioralPatterns.InterpreterPattern;

import java.util.ArrayList;
import java.util.Collection;

/**
 * SentenceNode
 *
 * @Desc 简单句子解释：非终结符表达式
 * @Author Wang Peng
 * @Date 2017/4/27 14:56
 */
public class SentenceNode extends AbstractNode {

    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }

    public static void main(String[] args) {
        Collection c = new ArrayList();
    }
}
