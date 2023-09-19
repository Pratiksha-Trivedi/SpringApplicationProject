package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Youtube")
public class Youtube implements Video {

	public Youtube() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		System.out.println("Youtube Like");
	}

	@Override
	public void share() {
		// TODO Auto-generated method stub
		System.out.println("Youtube Share");
	}

	@Override
	public void subscribe() {
		// TODO Auto-generated method stub
		System.out.println("Youtube Subscribe");
	}

}
