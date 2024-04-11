package com.section2.spring.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.*;
//let spring manage the object of the custom class
//record is a new feature that was released in JDK16


record Person(String name,int age,Address ad)
{
	
};
record Address(String firsLine , String city)
{
	
};

@Configuration
public class HelloWorldConfiguration {
	//in here we can define the spring beans
	@Bean
	public String name()
	{
		return "Jashan";
	}
	@Bean
	public int age()
	{
		return 21;
	}
	
	@Bean
	public Person person()
	{
		var person = new Person("Jashan",20,new Address("Baker Street","London"));
		return person;
	}
	//add @Primary if you want some particular bean to execute in case of multiple same beans
	@Primary
	@Bean(name = "address2")	//as we know the bean name is the name of the address how to change it
	public Address address()
	{
		return new Address("Baker Street","London");
	}

	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3()
		{
		return new Address("20 Guru Arjun Nagar","Yamunanagar");
		}
	//create a relation between the objects
	@Bean
	public Person person2MethodCall()
	{
		return new Person(name(),age(),address());  //hence we can make beans which are made upon other beans
	}
	@Bean
	public Person person3Parameters(String name , int age , Address address3)
	{
		return new Person(name,age,address3);
	}
	
	@Bean
	public Person person4Qualifier(String name , int age , @Qualifier("address3qualifier") Address address3)
	{
		return new Person(name,age,address3);
	}
	
   

}

