package com.maoyan.demo.aspectj;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public class AspectInstanceFactoryImpl implements AspectInstanceFactory {

    private Object aspectInstance;

    public AspectInstanceFactoryImpl() {
    }

    public AspectInstanceFactoryImpl(Object aspectInstance) {
        this.aspectInstance = aspectInstance;
    }

    public void setAspectInstance(Object aspectInstance) {
        this.aspectInstance = aspectInstance;
    }

    @Override
    public Object getAspectInstance() {
        return aspectInstance;
    }
}
