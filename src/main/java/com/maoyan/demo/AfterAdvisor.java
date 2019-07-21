package com.maoyan.demo;

public class AfterAdvisor implements After {
    public void invoke(){
        System.out.println("AfterAdvisor.invoke");
    }
}