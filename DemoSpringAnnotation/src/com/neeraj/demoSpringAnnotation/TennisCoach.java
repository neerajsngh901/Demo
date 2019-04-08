package com.neeraj.demoSpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
	

	

}
