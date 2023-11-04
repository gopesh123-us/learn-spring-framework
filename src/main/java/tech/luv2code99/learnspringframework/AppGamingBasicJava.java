package tech.luv2code99.learnspringframework;

import tech.luv2code99.learnspringframework.game.GameRunner;
import tech.luv2code99.learnspringframework.game.MarioGame;
import tech.luv2code99.learnspringframework.game.PacManGame;
import tech.luv2code99.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		var game = new PacManGame();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
