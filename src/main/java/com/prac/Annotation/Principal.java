package com.prac.Annotation;

import org.springframework.beans.factory.annotation.Value;

public class Principal {
	
	
	@Value("SM")
	private String name;
	
	public void principalInfo()
	{
		System.out.println("Primcipal name is "+name);
	}

}
