package com.neeraj.demoSpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServices implements FortuneServices {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "you are lucky to have output";
	}

}
