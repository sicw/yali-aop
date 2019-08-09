package com.maoyan.demo.annotation;

import com.maoyan.demo.Advice;
import com.maoyan.demo.Advisor;
import com.maoyan.demo.BeforeAdvice;
import com.maoyan.demo.aspectj.MetadataAwareAspectInstanceFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sichengwen
 * @date 2019/08/02
 *
 *
 * 获取完advisor放到advisored中
 *
 */
public class ReflectiveAspectJAdvisorFactory implements AspectJAdvisorFactory {
    @Override
    public List<Advisor> getAdvisors(MetadataAwareAspectInstanceFactory aif) {
        List<Advisor> result = new ArrayList<>();
        // 获取所有Method
        Method[] methods = aif.getAspectMetadata().getDeclaredMethods();
        // 获取注解
        for (Method method : methods) {
            Before before = method.getAnnotation(Before.class);
            if (before != null) {
                Advisor advisor = new Advisor() {
                    @Override
                    public Advice getAdvice() {
                        return new BeforeAdvice() {
                            @Override
                            public void invoke() {
                                System.out.println("ReflectiveAspectJAdvisorFactory.invoke");
                            }
                        };
                    }
                };
                result.add(advisor);
            }
        }
        return result;
    }
}