package github.lugom.Xadrez.chess.pieces;

import github.lugom.Xadrez.boardgame.Board;
import github.lugom.Xadrez.chess.ChessPiece;
import github.lugom.Xadrez.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString()
    {
        return "R";
    }
}
