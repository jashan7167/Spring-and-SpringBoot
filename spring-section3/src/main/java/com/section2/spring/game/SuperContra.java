package com.section2.spring.game;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //so as to avoid the no unique bean defination which makes the spring framework confused that which one of the bean to be used
public class SuperContra implements GamingConsole{
	  public void up(){
		    System.out.println("up");
		  }
		  public void down(){
			    System.out.println("sit down");
			  }
		  public void left(){
			    System.out.println("Go back");
			  }
		  
		  public void right(){
			    System.out.println("shoot a bullet");
			  }
}
