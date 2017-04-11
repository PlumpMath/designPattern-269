package com.wp.personal.SixCreatedPatterns.BuilderPattern.Builder;

/**
 * AngelBuilder
 *
 * @Desc 天使角色建造器：具体建造者
 * @Author Wang Peng
 * @Date 2017/4/11 15:15
 */
public class AngelBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("天使");
    }

    public void buildSex() {
        actor.setSex("女");
    }

    public void buildFace() {
        actor.setFace("漂亮");
    }

    public void buildCostume() {
        actor.setCostume("白裙");
    }

    public void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
