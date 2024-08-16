package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.strategies.winningstrategies;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Board;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Move;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{
    private Map<Symbol, Integer> leftDiagonalMap = new HashMap<>();
    private Map<Symbol, Integer> rightDiagonalMap = new HashMap<>();

    @Override
    public boolean isWinning(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        int boardSize = board.getDimension();

        // Left diagonal => row == col
        if(row == col){
            leftDiagonalMap.put(symbol, leftDiagonalMap.getOrDefault(symbol, 0) + 1);
//            System.out.println("leftDiagonalMap : " + leftDiagonalMap.get(symbol));
            if (leftDiagonalMap.get(symbol) == boardSize){
                return true;
            }
        }
        if(row + col == boardSize - 1){
            rightDiagonalMap.put(symbol, rightDiagonalMap.getOrDefault(symbol, 0) + 1);
//            System.out.println("rightDiagonalMap : " + rightDiagonalMap.get(symbol));
             return rightDiagonalMap.get(symbol) == boardSize;
        }
        return false;
    }
}