package tech.luv2code99.learnspringframework.game;

public class MarioGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("Jump");
	}
	
	@Override
	public void down() {
		System.out.println("Go into the hole");
	}
	
	@Override
	public void left() {
		System.out.println("Go back");
	}
	
	@Override
	public void right() {
		System.out.println("Accelerate");
	}
}
