package com.neeraj.demoSpringAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneServices fortuneServices;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneServices.getFortune();
	}
	@PostConstruct
	public void doStartingStuff() {
		System.out.println("<<<<<<<<<<Starting Point>>>>>>>>>>>>>>");
	}
	@PreDestroy
	public void doEndingStuff() {
		System.out.println("<<<<<<<<<<Ending Point>>>>>>>>>>>>>>");
	}
	

	

}
