package com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Imp;

import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Abstract.Approver;
import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.PurchaseRequest;

/**
 * Congress
 *
 * @Desc 董事会类：具体处理者
 * @Author Wang Peng
 * @Date 2017/4/20 14:10
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request.getNumber() +
                "，金额：" + request.getAmount() +
                "元，采购目的：" + request.getPurpose() + "。");
    }
}
