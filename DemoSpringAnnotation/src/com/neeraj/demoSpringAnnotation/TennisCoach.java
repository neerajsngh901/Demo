package com.neeraj.demoSpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("neeraj1")
public class TennisCoach implements Coach {
	private FortuneServices fortuneServices;
	@Autowired
	public TennisCoach(FortuneServices fortuneServices) {
		this.fortuneServices=fortuneServices;
	}
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
