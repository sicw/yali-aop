package com.maoyan.demo;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public class ReflectiveMethodInvocation {

    private List<MethodInterceptor> interceptors;

    private Method targetMethod;

    public ReflectiveMethodInvocation(Object target,Method targetMethod, List<MethodInterceptor> interceptors){
        this.targetMethod = targetMethod;
        this.interceptors = interceptors;
    }

    public Object invoke() {


        return null;
    }
}