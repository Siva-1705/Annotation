package com.prac.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


//@Component("collegeBean")  //by default component name will be class name

public class College {
	
	@Autowired
	private Principal principal;
	private Teacher teacher; //this is a interface variable
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public College()
	{
		System.out.println( "Hello World!" );
	}
	
	public void fun()
	{
		System.out.println( "This is my college" );
	}
	
	public void Info()
	{
		principal.principalInfo();
		teacher.teach();
	}

}
