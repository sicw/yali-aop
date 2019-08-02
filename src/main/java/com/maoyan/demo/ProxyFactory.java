package com.maoyan.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ProxyFactory {

    private List<Object> advisors = new ArrayList<>();

    private Object target;

    private List<MethodInterceptor> interceptors = new ArrayList<>();

    private AdvisedSupport advised = new AdvisedSupport();

    public void addAdvisor(Object advisor){
        advisors.add(advisor);
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(),target.getClass().getInterfaces(),new Handler());
    }

    public void addInterceptor(MethodInterceptor interceptor){
        interceptors.add(interceptor);
    }

    private class Handler implements InvocationHandler{

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            // 构建拦截器链
            ReflectiveMethodInvocation invocaton = new ReflectiveMethodInvocation(target,method,args,interceptors);

            return invocaton.proceed();


//            // 这里会判断advisors类型 然后串成一条调用连,暂时实现两种调用 before和after
//            List<Object> befores = new ArrayList<>();
//            List<Object> afters = new ArrayList<>();
//            for (Object advisor : advisors) {
//                if(advisor instanceof BeforeAdvice){
//                    befores.add(advisor);
//                } else if(advisor instanceof After){
//                    afters.add(advisor);
//                }
//            }
//
//            for (Object before : befores) {
//                ((BeforeAdvice)before).invoke();
//            }
//
//            Object ret = method.invoke(target,args);
//
//            for (Object after : afters) {
//                ((After)after).invoke();
//            }
//
//            return ret;
        }
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}