package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class StartApp {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ChessMatch match = new ChessMatch();
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(match.getPieces());
				System.out.println();
				System.out.print("Source: ");
					ChessPosition source = UI.readChessPosition(scan);
					
				System.out.println();
				System.out.print("Target: ");
					ChessPosition target = UI.readChessPosition(scan);
					
				ChessPiece capturedPiece = match.performChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				scan.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				scan.nextLine();
			}
			
		}
		
	}

}
