package github.lugom.Xadrez.chess;

import github.lugom.Xadrez.boardgame.Board;
import github.lugom.Xadrez.boardgame.Piece;
import github.lugom.Xadrez.boardgame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position)
    {
        ChessPiece p = (ChessPiece) getBoard().piece(position);

        return p != null && p.getColor() != color;
    }
}
