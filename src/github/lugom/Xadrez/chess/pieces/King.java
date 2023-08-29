package github.lugom.Xadrez.chess.pieces;

import github.lugom.Xadrez.boardgame.Board;
import github.lugom.Xadrez.chess.ChessPiece;
import github.lugom.Xadrez.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString()
    {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
