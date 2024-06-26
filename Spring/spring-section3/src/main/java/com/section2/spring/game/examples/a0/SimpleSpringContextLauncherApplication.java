package com.section2.spring.game.examples.a0;

import com.section2.spring.game.GamingConsole;
import com.section2.spring.game.Pacman;
import com.section2.spring.game.GameRunner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.section2.spring.game.examples.a1")
public class SimpleSpringContextLauncherApplication {

	//we wire the GamingConsole bean into the GameRunner and then that specific game is passed to the constructor of the ganerunner
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);)
		{			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //if its a component then its a bean itself
			
		}
		

	}

}
