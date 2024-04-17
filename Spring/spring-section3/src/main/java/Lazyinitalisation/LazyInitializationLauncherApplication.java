package Lazyinitalisation;


import com.section2.spring.game.Pacman;
import com.section2.spring.game.GameRunner;
import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
	class ClassA
	{
		
	}
@Component
@Lazy // then the class B will not be initialised at the startup hence tells whether the bean has to be intialized lazilly
class ClassB
{
	private ClassA classA;
	public ClassB(ClassA classA)
	{
		System.out.println("Some initalisation logic");
		this.classA = classA;
	}
	public void doSomething()
	{
		System.out.println("Do something");
	}
}



@Configuration
@ComponentScan //you have to do this without specifying the file path to find the components in the same file
public class LazyInitializationLauncherApplication {

	//we wire the GamingConsole bean into the GameRunner and then that specific game is passed to the constructor of the ganerunner
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);)
		{			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //if its a component then its a bean itself
			
			System.out.println("Initialisation of context is completed");
			
			context.getBean(ClassB.class).doSomething();  //hence we can see from here that the bean is loaded when its made use of
			
			
			
			
			
		}
	}

}