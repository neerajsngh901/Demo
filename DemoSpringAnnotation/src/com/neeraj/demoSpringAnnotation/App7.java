package com.neeraj.demoSpringAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsCoach.class);
		Coach c=context.getBean("tennisCoach",Coach.class);
		Coach c1=context.getBean("tennisCoach",Coach.class);
		boolean result=(c==c1);
		System.out.println("output- result: "+result+" | c:"+c+" |c1:"+c1);
		context.close();
	}

}
