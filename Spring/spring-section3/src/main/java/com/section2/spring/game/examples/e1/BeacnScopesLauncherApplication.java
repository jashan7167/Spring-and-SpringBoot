package com.section2.spring.game.examples.e1;

import com.section2.spring.game.GamingConsole;
import com.section2.spring.game.Pacman;
import com.section2.spring.game.GameRunner;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass
{
	
}
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass
{
	
}
@Configuration
@ComponentScan
public class BeacnScopesLauncherApplication {

	//we wire the GamingConsole bean into the GameRunner and then that specific game is passed to the constructor of the ganerunner
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(BeacnScopesLauncherApplication.class);)
		{			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //if its a component then its a bean itself
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
		}
	

	}

}
