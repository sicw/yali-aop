package com.maoyan.demo;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public interface MethodInterceptor {
    Object invoke(MethodInvocation invocation);
}