package com.neeraj.DemoSpring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("bean-applicationContext.xml");
		Coach coach=context.getBean("neeraj1",Coach.class);
		Coach coach1=context.getBean("neeraj1",Coach.class);
		boolean result=(coach == coach1);
		System.out.println(result);
		System.out.println(coach);
		System.out.println(coach1);
	}

}
