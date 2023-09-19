package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Instagram")
public class Instagram implements Video {

	public Instagram() {
		// TODO Auto-generated constructor stub
	
	}
	@Override
	
	public void like() {
		// TODO Auto-generated method stub
		System.out.println("Insta Like");
	} @Override
	public void share() {
		// TODO Auto-generated method stub
		System.out.println("Insta Share");
	}@Override
	public void subscribe() {
		// TODO Auto-generated method stub
		System.out.println("Insta subscribe");
		
	}

}
