package com.in28minutes.oopAgain.level4.interfaces;

public class GameRunner {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
//		ChessGame game = new ChessGame();
//
//		game.up();
//		game.down();
//		game.left();
//		game.right();

		GamingConsole[] games = { new MarioGame(), new ChessGame() };
		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
	}

}
