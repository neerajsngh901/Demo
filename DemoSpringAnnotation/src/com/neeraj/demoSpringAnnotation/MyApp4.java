package com.neeraj.demoSpringAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach c=context.getBean("neeraj",Coach.class);
		System.out.println(c.getDailyWorkout());
		context.close();
	}

}
