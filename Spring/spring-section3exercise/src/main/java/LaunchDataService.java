import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaunchDataService{
	//we wire the GamingConsole bean into the GameRunner and then that specific game is passed to the constructor of the ganerunner
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LaunchDataService.class);)
		{			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //if its a component then its a bean itself
			System.out.println(context.getBean(BusinessCalculationService.class));
		}
		

	}

}