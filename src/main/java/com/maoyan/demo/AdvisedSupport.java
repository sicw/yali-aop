package com.maoyan.demo;

import java.lang.reflect.Method;
import java.util.List;

public class AdvisedSupport {

    private Class[] interfaces;

    public AdvisedSupport() {
    }

    public AdvisedSupport(Class[] interfaces) {
        this.interfaces = interfaces;
    }

    /**
     *  1. 获取pointcut
     *  2. 判断该方法是否满足条件
     *  3. 获取该pointcut的advice
     *  4. 返回advices
     */
    public List<Object> getInterceptors(Method method, Class targetClass){
        return null;
    }
}