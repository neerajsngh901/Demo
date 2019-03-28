package com.neeraj.DemoSpring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach=context.getBean("neeraj",Coach.class);
		Coach coach1=context.getBean("neeraj1",Coach.class);
		CricketCoach cc=context.getBean("cricket",CricketCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getFortune());
		System.out.println(cc.getDailyWorkout());
		System.out.println(cc.getFortune());
		System.out.println(cc.getEmail());
		System.out.println(cc.getTeam());
	
		context.close();                                           

	}

}
