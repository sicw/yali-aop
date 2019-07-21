package com.maoyan.demo;

public class BeforeAdvisor implements Before {
    public void invoke(){
        System.out.println("BeforeAdvisor.invoke");
    }
}
