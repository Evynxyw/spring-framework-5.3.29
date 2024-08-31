package com.study.debug;

import com.study.debug.dto.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDebugApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Test test = context.getBean("test", Test.class);
		System.out.println(test);
	}
}