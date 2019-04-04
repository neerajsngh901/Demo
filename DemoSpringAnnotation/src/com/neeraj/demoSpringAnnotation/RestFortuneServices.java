package com.neeraj.demoSpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneServices implements FortuneServices {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "RestFortuneServices";
	}

}
