package com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Imp;

import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Abstract.Approver;
import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.PurchaseRequest;

/**
 * Director
 *
 * @Desc 主任类：具体处理者
 * @Author Wang Peng
 * @Date 2017/4/20 14:01
 */
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name +
                    "审批采购单：" + request.getNumber() +
                    "，金额：" + request.getAmount() +
                    "元，采购目的：" + request.getPurpose() + "。");//处理请求
        } else {
            this.successor.processRequest(request);//转发请求
        }
    }

}
