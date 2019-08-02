package com.maoyan.demo;

import com.maoyan.demo.annotation.Around;
import com.maoyan.demo.annotation.Aspect;
import com.maoyan.demo.annotation.Before;

@Aspect("pertarget(execution(* *.getSpouse()))")
public class PerTargetAspect {

	public int count;

	@Around("execution(int *.getAge())")
	public int returnCountAsAge() {
		return count++;
	}

	@Before("execution(void *.set*(int))")
	public void countSetter() {
		++count;
	}
}
