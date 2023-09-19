package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Facebook")

public class Facebook implements Video {

	public Facebook() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		System.out.println("Facebook Like");
	}

	@Override
	public void share() {
		// TODO Auto-generated method stub
		System.out.println("Facebook Share");
	}

	@Override
	public void subscribe() {
		// TODO Auto-generated method stub
		System.out.println("Facebook Subscribe");
	}

}
