package com.maoyan.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sichengwen
 * @date 2019/08/09
 */
public class DefauleAdvisorAdapterRegistry {

    private final List<AdvisorAdapter> adapters = new ArrayList<>(3);

    public DefauleAdvisorAdapterRegistry(){
        adapters.add(new MethodBeforeAdviceAdapter());
    }

    public MethodInterceptor[] getInterceptors(Advisor advisor){
        List<MethodInterceptor> interceptors = new ArrayList<>();
        for (AdvisorAdapter adapter : adapters) {
            if (adapter.supportAdvice(advisor.getAdvice())) {
                interceptors.add(adapter.getInterceptor(advisor));
            }
        }
        return interceptors.toArray(new MethodInterceptor[interceptors.size()]);
    }
}