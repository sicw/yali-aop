package com.maoyan.demo;

public class BeforeAdviceAdvisor implements BeforeAdvice {
    public void invoke(){
        System.out.println("BeforeAdviceAdvisor.invoke");
    }
}
