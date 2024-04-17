package com.section2.spring.game.examples.g1;


import com.section2.spring.game.Pacman;
import com.section2.spring.game.GameRunner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import jakarta.inject.Named;
import jakarta.inject.Inject;



//@Component
@Named
class BusinessService
{
	private DataService dataService;
	
	public DataService getDataService()
	{
		System.out.println("Setter injection");
		return dataService;
	}
	
//	@Autowired
	@Inject
	public void setDataService(DataService dataService)
	{
		this.dataService = dataService;
	}
}

//@Component
@Named
class DataService
{
	
}
@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

	//we wire the GamingConsole bean into the GameRunner and then that specific game is passed to the constructor of the ganerunner
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class);)
		{			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //if its a component then its a bean itself
			
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}
		

	}

}
