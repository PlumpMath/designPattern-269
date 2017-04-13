package com.wp.personal.SevenStructuralPatterns.CompositePattern.Entity;

/**
 * AbstractFile
 *
 * @Desc //抽象文件类：抽象构件
 * @Author Wang Peng
 * @Date 2017/4/12 11:40
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
