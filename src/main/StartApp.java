package main;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class StartApp {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ChessMatch match = new ChessMatch();
		
		while (true) {
			UI.printBoard(match.getPieces());
			System.out.println();
			System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(scan);
				
			System.out.println();
			System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(scan);
				
			ChessPiece capturedPiece = match.performChessMove(source, target);
			
		}
		
	}

}
