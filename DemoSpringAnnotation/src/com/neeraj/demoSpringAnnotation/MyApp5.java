package com.neeraj.demoSpringAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach c=context.getBean("neeraj",Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		
		context.close();
	}

}
