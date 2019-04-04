package com.neeraj.demoSpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "DatabaseFortuneService";
	}

}
