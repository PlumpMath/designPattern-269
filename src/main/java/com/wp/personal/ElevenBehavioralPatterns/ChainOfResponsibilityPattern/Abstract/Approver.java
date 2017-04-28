package com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Abstract;

import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.PurchaseRequest;

/**
 * Approver
 *
 * @Desc 审批者类：抽象处理者
 * @Author Wang Peng
 * @Date 2017/4/20 13:55
 */
public abstract class Approver {
    protected Approver successor; //定义后继对象
    protected String name; //审批者名字

    public Approver(String name) {
        this.name = name;
    }

    //设置后继者
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);

}
