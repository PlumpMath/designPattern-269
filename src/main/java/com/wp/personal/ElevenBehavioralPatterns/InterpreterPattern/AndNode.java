package com.wp.personal.ElevenBehavioralPatterns.InterpreterPattern;

/**
 * AndNode
 *
 * @Desc And解释：非终结符表达式
 * @Author Wang Peng
 * @Date 2017/4/27 14:53
 */
public class AndNode extends AbstractNode {

    private AbstractNode left;//And的左表达式

    private AbstractNode right;//And的右表达式

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
