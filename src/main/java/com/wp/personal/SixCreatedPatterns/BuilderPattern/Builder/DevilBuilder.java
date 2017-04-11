package com.wp.personal.SixCreatedPatterns.BuilderPattern.Builder;

/**
 * DevilBuilder
 *
 * @Desc 恶魔角色建造器：具体建造者
 * @Author Wang Peng
 * @Date 2017/4/11 15:16
 */
public class DevilBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("恶魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("丑陋");
    }

    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
