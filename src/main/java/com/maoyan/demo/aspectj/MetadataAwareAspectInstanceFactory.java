package com.maoyan.demo.aspectj;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public interface MetadataAwareAspectInstanceFactory extends AspectInstanceFactory {

    AspectMetadata getAspectMetadata();

}
