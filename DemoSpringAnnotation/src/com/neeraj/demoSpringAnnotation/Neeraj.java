package com.neeraj.demoSpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Neeraj implements Coach {
	private FortuneServices fortuneServices;
	@Autowired
	public Neeraj(FortuneServices fortuneServices) {
		this.fortuneServices=fortuneServices;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Neeraj ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneServices.getFortune();
	}

}
