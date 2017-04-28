package com.wp.personal.ElevenBehavioralPatterns.InterpreterPattern;

/**
 * DistanceNode
 *
 * @Desc 距离解释：终结符表达式
 * @Author Wang Peng
 * @Date 2017/4/28 17:00
 */
public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    //距离表达式的解释操作
    public String interpret() {
        return this.distance;
    }
}
