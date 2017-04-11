package com.wp.personal.SixCreatedPatterns.PrototypePattern.DeepClone;

import java.io.Serializable;

/**
 * Attachment
 *
 * @Desc 附件类
 * @Author Wang Peng
 * @Date 2017/4/11 13:50
 */
public class Attachment implements Serializable {
    private String name;//附件名

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
