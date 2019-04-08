package com.neeraj.demoSpringAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach c=context.getBean("tennisCoach",Coach.class);
		Coach c1=context.getBean("tennisCoach",Coach.class);
		boolean result=(c==c1);
		System.out.println("output- result: "+result+" | c:"+c+" |c1:"+c1);
		context.close();
	}

}
