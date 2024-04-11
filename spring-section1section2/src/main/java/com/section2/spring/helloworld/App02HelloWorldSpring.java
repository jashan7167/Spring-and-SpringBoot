package com.section2.spring.helloworld;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App02HelloWorldSpring {
	public static void main(String[]args)
	{
		//we already have a jvm running inside that we will create a spring context in it
		//launch a spring contenxt
	   try(  
			   var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)
			   //Configure the things that we want Spring to manage - @Configuration
			   //name = @Bean
			   )
	   {
		   //3.Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));			
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address2"));	
			System.out.println(context.getBean(Address.class));	
			System.out.println(context.getBean("person2MethodCall"));	//calling the other beans in a bean to return something
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("person4Qualifier"));
			//Print all the beans
			System.out.println("Print all the beans");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	   }	
	}	
}
