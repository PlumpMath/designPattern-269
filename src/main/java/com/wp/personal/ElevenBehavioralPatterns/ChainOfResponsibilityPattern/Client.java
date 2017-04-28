package com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern;

import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Abstract.Approver;
import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Imp.Congress;
import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Imp.Director;
import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Imp.President;
import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Imp.VicePresident;

/**
 * Client
 *
 * @Desc 客户端——职责链模式
 * @Author Wang Peng
 * @Date 2017/4/20 14:12
 */
public class Client {
    public static void main(String[] args) {
        Approver wjzhang, gyang, jguo, meeting;
        wjzhang = new Director("张无忌");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        //创建职责链
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买《金刚经》");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");
        wjzhang.processRequest(pr4);
    }
}
