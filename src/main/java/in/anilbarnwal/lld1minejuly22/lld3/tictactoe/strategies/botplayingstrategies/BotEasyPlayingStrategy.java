package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.strategies.botplayingstrategies;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Board;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Cell;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.CellState;

public class BotEasyPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Cell makeMove(Board board) {
        // Generate a random move
        int row, col;
        do {
            row = (int) (Math.random() * board.getDimension());
            col = (int) (Math.random() * board.getDimension());
        } while (board.getBoard().get(row).get(col).getCellState() != CellState.EMPTY);
        return new Cell(row, col);
    }
}
