package github.lugom.Xadrez.application;

import github.lugom.Xadrez.chess.ChessMatch;
import github.lugom.Xadrez.chess.ChessPiece;

public class Program
{
    public static void main(String[] args)
    {
        ChessMatch chessMatch = new ChessMatch();
        ChessPiece[][] a = chessMatch.getPieces();
        UI.printBoard(a);
    }
}
