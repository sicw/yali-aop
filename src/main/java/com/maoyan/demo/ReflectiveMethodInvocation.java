package com.maoyan.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public class ReflectiveMethodInvocation implements MethodInvocation {

    private List<MethodInterceptor> interceptors;

    private Method targetMethod;

    private Object targetObject;

    private Object[] args;

    private int index = -1;

    public ReflectiveMethodInvocation(Object target,Method targetMethod,Object[] args, List<MethodInterceptor> interceptors){
        this.targetMethod = targetMethod;
        this.interceptors = interceptors;
        this.args = args;
    }

    @Override
    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        if(index == (interceptors.size() - 1)){
            return targetMethod.invoke(targetObject,args);
        }
        MethodInterceptor interceptor = interceptors.get(++index);
        return interceptor.invoke(this);
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