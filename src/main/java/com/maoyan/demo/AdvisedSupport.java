package com.maoyan.demo;

import java.util.List;

public class AdvisedSupport {

    private Class[] interfaces;

    public AdvisedSupport() {
    }

    public AdvisedSupport(Class[] interfaces) {
        this.interfaces = interfaces;
    }

    public List<Object> getInterceptors(){
        return null;
    }
}