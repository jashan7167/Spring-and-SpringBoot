package com.section2.spring;

import com.section2.spring.game.GamingConsole;
import com.section2.spring.game.GameRunner;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);)
		{			
			context.getBean(GamingConsole.class).up(); 
			context.getBean(GameRunner.class).run();
		}
		

	}

}
