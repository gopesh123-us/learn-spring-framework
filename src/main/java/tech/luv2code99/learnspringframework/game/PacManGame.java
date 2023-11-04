package tech.luv2code99.learnspringframework.game;

public class PacManGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump PacMan");

	}

	@Override
	public void down() {
		System.out.println("Hide below PacMan");

	}

	@Override
	public void left() {
		System.out.println("Move left PacMan");
	}

	@Override
	public void right() {		
		System.out.println("More right PacMan");
	}

}
