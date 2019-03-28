package com.neeraj.demoSpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Neeraj implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Neeraj ";
	}

}
