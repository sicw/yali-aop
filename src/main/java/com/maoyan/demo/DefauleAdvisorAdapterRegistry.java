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

    }

    public MethodInterceptor[] getInterceptors(Advisor advisor){
        return null;
    }
}