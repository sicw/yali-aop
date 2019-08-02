package com.maoyan.demo.annotation;

import com.maoyan.demo.Advisor;
import com.maoyan.demo.aspectj.MetadataAwareAspectInstanceFactory;

import java.util.List;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public class ReflectiveAspectJAdvisorFactory implements AspectJAdvisorFactory {
    @Override
    public List<Advisor> getAdvisors(MetadataAwareAspectInstanceFactory aif) {
        return null;
    }
}
