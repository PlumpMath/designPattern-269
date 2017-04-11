package com.wp.personal.SixCreatedPatterns.BuilderPattern.Builder;

/**
 * HeroBuilder
 *
 * @Desc 英雄角色建造器：具体建造者
 * @Author Wang Peng
 * @Date 2017/4/11 15:14
 */
public class HeroBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("英雄");
    }

    public void buildSex() {
        actor.setSex("男");
    }

    public void buildFace() {
        actor.setFace("英俊");
    }

    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
