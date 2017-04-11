package com.wp.personal.SixCreatedPatterns.BuilderPattern;

import com.wp.personal.SixCreatedPatterns.BuilderPattern.Builder.ActorBuilder;
import com.wp.personal.SixCreatedPatterns.BuilderPattern.Entity.Actor;

/**
 * ActorController
 *
 * @Desc 游戏角色创建控制器：指挥者
 * @Author Wang Peng
 * @Date 2017/4/11 15:17
 */
public class ActorController {
    //逐渐构建复杂产品对象
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }
}
