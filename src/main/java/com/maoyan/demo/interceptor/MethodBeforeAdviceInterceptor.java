package com.maoyan.demo.interceptor;

import com.maoyan.demo.BeforeAdvice;
import com.maoyan.demo.MethodInterceptor;
import com.maoyan.demo.MethodInvocation;

/**
 * @author sichengwen
 * @date 2019/08/09
 */
public class MethodBeforeAdviceInterceptor implements MethodInterceptor {

    private BeforeAdvice advice;

    public MethodBeforeAdviceInterceptor(BeforeAdvice advice) {
        this.advice = advice;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Exception {
        advice.invoke();
        return invocation.proceed();
    }
}
