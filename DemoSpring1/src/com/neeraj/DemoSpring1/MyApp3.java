package com.neeraj.DemoSpring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext2.xml");
		Coach coach=context.getBean("neeraj1",Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}

}
