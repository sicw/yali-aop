package com.maoyan.demo;

import com.maoyan.demo.annotation.Aspect;
import com.maoyan.demo.annotation.Before;

/**
 * @author sichengwen
 * @date 2019/08/09
 */
@Aspect(value = "test")
public class TargetBean {
    @Before
    public void doWork(){
        System.out.println("TargetBean.doWork");
    }
}