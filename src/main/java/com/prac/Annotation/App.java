package com.prac.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
    	College college=context.getBean("colBean",College.class);
    	college.fun();
    	college.Info();
    	context.close();
    	
    }
}
