package com.maoyan.demo.aspectj;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public class MetadataAwareAspectInstanceFactoryImpl extends AspectInstanceFactoryImpl implements MetadataAwareAspectInstanceFactory {

    private AspectMetadata aspectMetadata;

    public void setAspectMetadata(AspectMetadata aspectMetadata) {
        this.aspectMetadata = aspectMetadata;
    }

    @Override
    public AspectMetadata getAspectMetadata() {
        return aspectMetadata;
    }
}