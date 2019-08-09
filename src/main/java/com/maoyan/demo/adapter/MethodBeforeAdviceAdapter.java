package com.maoyan.demo.adapter;

import com.maoyan.demo.*;
import com.maoyan.demo.interceptor.MethodBeforeAdviceInterceptor;

/**
 * @author sichengwen
 * @date 2019/08/09
 */
public class MethodBeforeAdviceAdapter implements AdvisorAdapter {
    @Override
    public boolean supportAdvice(Advice advice) {
        return true;
    }

    @Override
    public MethodInterceptor getInterceptor(Advisor advisor) {
        BeforeAdvice advice = (BeforeAdvice) advisor.getAdvice();
        return new MethodBeforeAdviceInterceptor(advice);
    }
}
