package com.wp.personal.SixCreatedPatterns.BuilderPattern.Builder;

import com.wp.personal.SixCreatedPatterns.BuilderPattern.Entity.Actor;

/**
 * ActorBuilder
 *
 * @Desc 抽象建造者
 * @Author Wang Peng
 * @Date 2017/4/11 15:11
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    //工厂方法，返回一个完整的游戏角色对象
    public Actor createActor() {
        return actor;
    }
}
