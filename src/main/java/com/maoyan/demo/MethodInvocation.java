package com.maoyan.demo;

import java.lang.reflect.Method;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public interface MethodInvocation {
    Method getMethod();

    Object[] getArgs();
}