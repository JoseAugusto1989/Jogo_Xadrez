package main;

import chess.ChessMatch;

public class StartApp {
	
	public static void main(String[] args) {
		
		ChessMatch match = new ChessMatch();
		
		UI.printBoard(match.getPieces());
		
	}

}
