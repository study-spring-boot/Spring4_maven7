package com.xywei.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xywei.config.ConfigBean;
import com.xywei.service.ListDirService;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
		ListDirService service = context.getBean(ListDirService.class);
		System.out.println(context.getEnvironment().getProperty("os.name") + "系统" + service.showDir());
		context.close();
	}
}
