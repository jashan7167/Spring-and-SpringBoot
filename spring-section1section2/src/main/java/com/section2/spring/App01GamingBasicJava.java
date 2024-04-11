package com.section2.spring;

import com.section2.spring.game.GameRunner;
import com.section2.spring.game.MarioGame;
import com.section2.spring.game.SuperContra;
import com.section2.spring.game.Pacman;


public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var marioGame = new MarioGame();
//		var superContra = new SuperContra();
		var game = new SuperContra();  // 1 Object Creating
		var game2 = new MarioGame();
		var game3 = new Pacman();
		
		// here we have to invoke the class we want the interface to use the overriden function of
		var gameRunner = new GameRunner(game3); //2.Object Creating + Wiring of Depencies .. Game is a dependency of GameRunner
		//now we can see that it is a looselycoupled system we dont have to chage anything now
		//after that we bring the magic of spring into it
		gameRunner.run();

	}

}
