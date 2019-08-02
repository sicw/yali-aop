package com.maoyan.demo;

import com.maoyan.demo.interceptors.AfterInterceptor;
import com.maoyan.demo.interceptors.BeforeInterceptor;
import com.maoyan.demo.interceptors.SimpleInterceptor;
import org.junit.Test;

public class ProxyFactoryTest {

    @Test
    public void testProxyFactory(){
        TestBean testBean = new TestBean();
        testBean.setAge(23);
        testBean.setName("sicwen");

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(testBean);
        proxyFactory.addAdvisor(new AfterAdvisor());
        proxyFactory.addAdvisor(new BeforeAdvisor());

        ITestBean demo = (ITestBean) proxyFactory.getProxy();

        System.out.println(demo.getAge());
        System.out.println(demo.getName());
    }

    @Test
    public void testInterceptor(){
        TestBean testBean = new TestBean();
        testBean.setAge(23);
        testBean.setName("sicwen");

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(testBean);
        proxyFactory.addInterceptor(new AfterInterceptor());
        proxyFactory.addInterceptor(new SimpleInterceptor());
        proxyFactory.addInterceptor(new BeforeInterceptor());

        ITestBean demo = (ITestBean) proxyFactory.getProxy();

        demo.doWork();
    }

    @Test
    public void testTwiceProxy(){
        TestBean testBean = new TestBean();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(testBean);
        proxyFactory.addInterceptor(new BeforeInterceptor());

        Object target = proxyFactory.getProxy();

        ProxyFactory proxyFactoryNew = new ProxyFactory();
        proxyFactoryNew.setTarget(target);
        proxyFactoryNew.addInterceptor(new AfterInterceptor());

        ITestBean newObject = (ITestBean) proxyFactoryNew.getProxy();

        newObject.doWork();
    }
}