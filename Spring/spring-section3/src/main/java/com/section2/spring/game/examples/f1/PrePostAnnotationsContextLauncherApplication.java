package com.section2.spring.game.examples.f1;

import com.section2.spring.game.GamingConsole;
import com.section2.spring.game.Pacman;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import com.section2.spring.game.GameRunner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass
{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency)
	{
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready"); //this is where the dependency is ready or autowired
	}
	//as soon as dependency are wired in
	@PostConstruct  //this will allow to initialise something when the beans are ready after the dependency injection is done
	public void initialize()
	{
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() //this is typically used to free the resources the bean is holding this is might where you will close your active connections
	{
		System.out.println("Cleanup");
	}
	
}

@Component
class SomeDependency
{
	public void getReady()
	{
		System.out.println("some initialisation");
		
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

	//we wire the GamingConsole bean into the GameRunner and then that specific game is passed to the constructor of the ganerunner
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);)
		{			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //if its a component then its a bean itself
			
		}
		

	}

}
