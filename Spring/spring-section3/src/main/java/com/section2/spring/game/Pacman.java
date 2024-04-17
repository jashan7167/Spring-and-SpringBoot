package com.section2.spring.game;
import org.springframework.stereotype.Component;
//this is a component spring will manage and we dont have to create an explicit object
@Component
public class Pacman implements GamingConsole {
	  public void up(){
		    System.out.println("Up");
		  }
		  public void down(){
			    System.out.println("DOWN");
			  }
		  public void left(){
			    System.out.println("Go back");
			  }
		  
		  public void right(){
			    System.out.println("Go right");
			  }

}
