package com.section2.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.section2.spring.game.GameRunner;
import com.section2.spring.game.GamingConsole;
import com.section2.spring.game.Pacman;



@Configuration
public class GamingConfiguration {

	//creating a bean to return a GamingConsole object which is obviously implemented by the
	//pacman class
	@Bean
	public GamingConsole game()
	{
		var game = new Pacman();
		return game;
	}
	//we wire the GamingConsole bean into the GameRunner and then that specific game is passed to the constructor of the ganerunner
	@Bean
	public GameRunner gameRunner(GamingConsole game)
	{
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
