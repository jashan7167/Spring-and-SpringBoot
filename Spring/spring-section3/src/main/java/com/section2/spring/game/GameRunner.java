package com.section2.spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
//now we will be able to have the spring framework to create it for us
public class GameRunner {
	//create a instance of GamingConsole game
	private GamingConsole game;
	
	public GameRunner(@Qualifier("mariogamequalifier") GamingConsole game)
	{
		this.game = game;
	}

	public void run()
	{
		System.out.println("Running game: " + game); //it is effiecient from a logging framework till then we gonna use sout
		game.up();
		game.down();
		game.left();
		game.right();
		
		
	}

}
