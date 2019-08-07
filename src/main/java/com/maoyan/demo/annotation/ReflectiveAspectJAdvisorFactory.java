package com.maoyan.demo.annotation;

import com.maoyan.demo.Advisor;
import com.maoyan.demo.aspectj.MetadataAwareAspectInstanceFactory;

import java.lang.reflect.Method;
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

        // 获取静态的Interceptor和动态解析的Interceptor(Advisor  哪些过滤哪些不过滤)






        // 获取所有Method
        Method[] methods = aif.getAspectMetadata().getDeclaredMethods();
        // 获取注解
        for (Method method : methods) {
            Before before = method.getAnnotation(Before.class);
            if (before != null) {
                // 获取Before的Interceptor

                continue;
            }
        }


        // 查找注册的Interceptor

        // 返回Interceptor

        return null;
    }
}
