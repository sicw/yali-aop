package com.maoyan.demo.interceptors;

import com.maoyan.demo.MethodInterceptor;
import com.maoyan.demo.MethodInvocation;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public class AfterInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Exception {
        Object result = invocation.proceed();
        System.out.println("AfterInterceptor.invoke");
        return result;
    }
}
