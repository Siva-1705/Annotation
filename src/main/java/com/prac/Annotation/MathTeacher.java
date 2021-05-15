package com.prac.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;


@Primary  //by defautly or if not mentioned take this class
public class MathTeacher implements Teacher {
	
	
	@Value("APPAJI")
	private String name;
	
	
    
	public void setName(String name) {
		this.name = name;
	}



	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("Hi ,I am "+ name+" I am your maths teacher");
      
	}

}
