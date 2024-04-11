package com.section2.spring;

import com.section2.spring.game.GamingConsole;
import com.section2.spring.game.Pacman;
import com.section2.spring.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.section2.spring.game") //this is used such that spring would search the component in the package
public class GamingAppLauncherApplication {

	//we wire the GamingConsole bean into the GameRunner and then that specific game is passed to the constructor of the ganerunner
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);)
		{			
			context.getBean(GamingConsole.class).up(); 
			context.getBean(GameRunner.class).run();
		}
		

	}

}