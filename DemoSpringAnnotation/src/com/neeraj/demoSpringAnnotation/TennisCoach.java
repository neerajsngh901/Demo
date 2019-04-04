package com.neeraj.demoSpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneServices")
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
