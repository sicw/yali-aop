package com.maoyan.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ProxyFactory {

    private List<Object> advisors = new ArrayList<>();

    private Object target;

    private AdvisedSupport advised = new AdvisedSupport();

    public void addAdvisor(Object advisor){
        advisors.add(advisor);
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(),target.getClass().getInterfaces(),new Handler());
    }

    private class Handler implements InvocationHandler{

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //这里会判断advisors类型 然后串成一条调用连,暂时实现两种调用 before和after
            List<Object> befores = new ArrayList<>();
            List<Object> afters = new ArrayList<>();
            for (Object advisor : advisors) {
                if(advisor instanceof Before){
                    befores.add(advisor);
                } else if(advisor instanceof After){
                    afters.add(advisor);
                }
            }

            for (Object before : befores) {
                ((Before)before).invoke();
            }

            Object ret = method.invoke(target,args);

            for (Object after : afters) {
                ((After)after).invoke();
            }

            return ret;
        }
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}