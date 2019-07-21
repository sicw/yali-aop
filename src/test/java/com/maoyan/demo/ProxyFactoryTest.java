package com.maoyan.demo;

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
}