package com.wp.personal.SevenStructuralPatterns.AdapterPattern;

/**
 * ScoreOperation
 *
 * @Desc 抽象成绩操作类：目标接口
 * @Author Wang Peng
 * @Date 2017/4/11 16:16
 */
public interface ScoreOperation {
    public int[] sort(int array[]);//成绩排序

    public int search(int array[], int key);//成绩查找
}
