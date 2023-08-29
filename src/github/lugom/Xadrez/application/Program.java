package github.lugom.Xadrez.application;

import github.lugom.Xadrez.chess.ChessException;
import github.lugom.Xadrez.chess.ChessMatch;
import github.lugom.Xadrez.chess.ChessPiece;
import github.lugom.Xadrez.chess.ChessPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<ChessPiece>();


        while(true)
        {
            try
            {
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                if(capturedPiece != null){
                    captured.add(capturedPiece);
                }
            }
            catch (ChessException | InputMismatchException e)
            {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
