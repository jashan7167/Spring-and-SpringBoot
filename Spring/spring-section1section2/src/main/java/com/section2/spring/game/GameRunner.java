package com.section2.spring.game;

public class GameRunner {
	//create a instance of GamingConsole game
	private GamingConsole game;
	
	public GameRunner(GamingConsole game)
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
