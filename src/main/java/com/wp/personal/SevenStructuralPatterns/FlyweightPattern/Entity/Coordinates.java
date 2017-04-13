package com.wp.personal.SevenStructuralPatterns.FlyweightPattern.Entity;

/**
 * Coordinates
 *
 * @Desc 坐标类：外部状态类
 * @Author Wang Peng
 * @Date 2017/4/13 15:30
 */
public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
