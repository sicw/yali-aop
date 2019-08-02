package com.maoyan.demo;

/**
 * @author sichengwen
 * @date 2019/08/02
 * 所以叫连接点
 * A -> B -> target
 * D <- C <-
 */
public interface JoinPoint {
    Object proceed();
}