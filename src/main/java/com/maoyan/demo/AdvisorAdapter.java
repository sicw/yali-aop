package com.maoyan.demo;

/**
 * @author sichengwen
 * @date 2019/08/09
 */
public interface AdvisorAdapter {
    boolean supportAdvice(Advice advice);

    MethodInterceptor getInterceptor(Advisor advisor);
}