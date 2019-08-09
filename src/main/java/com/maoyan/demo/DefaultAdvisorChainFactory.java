package com.maoyan.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sichengwen
 * @date 2019/08/09
 */
public class DefaultAdvisorChainFactory {
    public List<Object> getInterceptorsAndDynamicInterceptionAdvice(List<Advisor> advisors){
        List<Object> result = new ArrayList<>();
        DefauleAdvisorAdapterRegistry registry = new DefauleAdvisorAdapterRegistry();
        for (Advisor advisor : advisors) {
            MethodInterceptor[] interceptors = registry.getInterceptors(advisor);
            result.addAll(Arrays.asList(interceptors));
        }
        return result;
    }
}