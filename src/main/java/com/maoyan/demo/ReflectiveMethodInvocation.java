package com.maoyan.demo;

import sun.rmi.transport.ObjectTable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public class ReflectiveMethodInvocation implements MethodInvocation {

    private List<MethodInterceptor> interceptors;

    private List<Object> interceptorsAndDynamicMethodMatchers;

    private Method targetMethod;

    private Object targetObject;

    private Object[] args;

    private int index = -1;

    public ReflectiveMethodInvocation(Object target,Method targetMethod,Object[] args, List<MethodInterceptor> interceptors,List<Object> chain){
        this.targetObject = target;
        this.targetMethod = targetMethod;
        this.args = args;
        this.interceptors = interceptors;
        this.interceptorsAndDynamicMethodMatchers = chain;
    }

    @Override
    public Object proceed() throws Exception {
        if(index == (interceptorsAndDynamicMethodMatchers.size() - 1)){
            return targetMethod.invoke(targetObject,args);
        }
        Object interceptor = interceptorsAndDynamicMethodMatchers.get(++index);

        if(interceptor instanceof MethodInterceptor){
            return ((MethodInterceptor) interceptor).invoke(this);
        }
        return null;
    }

    @Override
    public Method getMethod() {
        return targetMethod;
    }

    @Override
    public Object[] getArgs() {
        return args;
    }
}