package com.prac.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.prac.Annotation")
public class CollegeConfig {
	
	//this is the another method to  create a bean
	@Bean({"colBean" , "collegeBean" } )
	public College collegeBean()//method namecollegeBean is the bean id by default
	{
		College college=new College();
		college.setTeacher(teacher());   //setter injection
		return college;
	}
	
	@Bean("principal")
	public Principal principal()
	{
		return new Principal();
	}
	
	@Bean("teacher")
	public Teacher teacher()
	{
		Teacher teacher=new MathTeacher();
		return teacher;
	}
	
	
	

}
