package com.xywei.service;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.out.println("os: " + context.getEnvironment().getProperty("os.name"));
		boolean flag = context.getEnvironment().getProperty("os.name").contains("Linux");
		return flag;
	}

}
