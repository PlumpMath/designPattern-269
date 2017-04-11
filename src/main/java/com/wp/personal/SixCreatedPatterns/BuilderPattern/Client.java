package com.wp.personal.SixCreatedPatterns.BuilderPattern;

import com.wp.personal.SixCreatedPatterns.BuilderPattern.Builder.ActorBuilder;
import com.wp.personal.SixCreatedPatterns.BuilderPattern.Builder.AngelBuilder;
import com.wp.personal.SixCreatedPatterns.BuilderPattern.Entity.Actor;

/**
 * Client
 *
 * @Desc 客户端——建造者模式
 * @Author Wang Peng
 * @Date 2017/4/11 15:20
 */
public class Client {
    public static void main(String[] args) {
        ActorBuilder ab = new AngelBuilder(); //针对抽象建造者编程
        ActorController ac = new ActorController();
        Actor actor;
        actor = ac.construct(ab); //通过指挥者创建完整的建造者对象

        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }
}
