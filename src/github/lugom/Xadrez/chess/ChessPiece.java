package github.lugom.Xadrez.chess;

import github.lugom.Xadrez.boardgame.Board;
import github.lugom.Xadrez.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
