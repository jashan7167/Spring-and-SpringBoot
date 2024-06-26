package com.section2.spring.game.examples.a1;
import java.util.*;
import com.section2.spring.game.GamingConsole;
import com.section2.spring.game.Pacman;
import com.section2.spring.game.GameRunner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//You business class
//Dependency1
//Dependency2
@Component
class YourBusinessClass
{
	//injecting the dependencies
	//autowired annotations	
	//field injection
	Dependency1 dependency1;
	Dependency2 dependency2;
		
	
	//Setter injections
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter injection - setDependency1");
//		this.dependency1 = dependency1;
//	}
//
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter injection - setDependency2");
//		this.dependency2 = dependency2;
//	}




	public String toString()
	{
		return "Using" + dependency1 + "and" + dependency2;
	}

	//@Autowired it can create an dependency injection if we dont have an autowired in there
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - Your BusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
}
@Component
class Dependency1
{
	
}
@Component
class Dependency2
{
	
}


@Configuration
@ComponentScan("com.section2.spring.game.examples.a1")
public class DepInjectionLauncherApplication {

	//we wire the GamingConsole bean into the GameRunner and then that specific game is passed to the constructor of the ganerunner
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);)
		{			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //if its a component then its a bean itself
			System.out.println(context.getBean(YourBusinessClass.class));
		}
		

	}

}
