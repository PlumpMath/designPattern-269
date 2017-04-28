package com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Imp;

import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.Abstract.Approver;
import com.wp.personal.ElevenBehavioralPatterns.ChainOfResponsibilityPattern.PurchaseRequest;

/**
 * VicePresident
 *
 * @Desc 副董事长类：具体处理者
 * @Author Wang Peng
 * @Date 2017/4/20 14:03
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    //具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" + this.name +
                    "审批采购单：" + request.getNumber() +
                    "，金额：" + request.getAmount() +
                    "元，采购目的：" + request.getPurpose() + "。");  //处理请求
        } else {
            this.successor.processRequest(request);  //转发请求
        }
    }
}
