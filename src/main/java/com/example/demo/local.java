package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("local")
public class local {

	Video video;

	public local() {
		// TODO Auto-generated constructor stub
		System.out.println("local.local()");
	}

	/*
	 * @Autowired
	 * 
	 * @Qualifier("youtube")
	 * 
	 * Video video;
	 */

	@Autowired
	@Qualifier("Youtube")
	public void setVideo(Video video) {
		this.video = video;
	}

}
