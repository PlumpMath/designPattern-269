package com.wp.personal.SevenStructuralPatterns.FlyweightPattern.Entity;

/**
 * IgoChessman
 *
 * @Desc 围棋棋子类：抽象享元类
 * @Author Wang Peng
 * @Date 2017/4/13 15:21
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coord) {
        System.out.println("棋子颜色：" + this.getColor() +
                "，棋子位置：" + coord.getX() + "，" + coord.getY());
    }
}
