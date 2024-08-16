package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.services.winningstrategies;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Board;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Move;

public interface WinningStrategy {
    boolean isWinning(Board board, Move move);
}
