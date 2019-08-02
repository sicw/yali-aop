package com.maoyan.demo.interceptors;

import com.maoyan.demo.MethodInterceptor;
import com.maoyan.demo.MethodInvocation;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public class SimpleInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Exception {
        System.out.println("SimpleInterceptor.invoke");
        return invocation.proceed();
    }
}
