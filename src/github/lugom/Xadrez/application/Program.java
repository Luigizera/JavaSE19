package github.lugom.Xadrez.application;

import github.lugom.Xadrez.chess.ChessException;
import github.lugom.Xadrez.chess.ChessMatch;
import github.lugom.Xadrez.chess.ChessPiece;
import github.lugom.Xadrez.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while(true)
        {
            try
            {
                UI.clearScreen();
                ChessPiece[][] a = chessMatch.getPieces();
                UI.printBoard(a);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(a, possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException | InputMismatchException e)
            {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
