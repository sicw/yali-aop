package com.maoyan.demo.aspectj;

import com.maoyan.demo.annotation.Aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author sichengwen
 * @date 2019/08/02
 */
public class AspectMetadata {

    private Method[] declaredMethods;

    private String pointcutExpression;

    public AspectMetadata(Class<?> aspectClass) {
        declaredMethods = aspectClass.getDeclaredMethods();
        Aspect aspect = aspectClass.getAnnotation(Aspect.class);
        pointcutExpression = aspect.value();
    }

    @Override
    public String toString() {
        return "AspectMetadata{" +
                "declaredMethods=" + Arrays.toString(declaredMethods) +
                ", pointcutExpression='" + pointcutExpression + '\'' +
                '}';
    }

    public Method[] getDeclaredMethods() {
        return declaredMethods;
    }

    public void setDeclaredMethods(Method[] declaredMethods) {
        this.declaredMethods = declaredMethods;
    }

    public String getPointcutExpression() {
        return pointcutExpression;
    }

    public void setPointcutExpression(String pointcutExpression) {
        this.pointcutExpression = pointcutExpression;
    }
}