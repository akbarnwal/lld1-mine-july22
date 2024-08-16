package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.strategies.winningstrategies;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Board;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Move;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy{
    Map<Integer, Map<Symbol, Integer>> colMaps = new HashMap<>();

    @Override
    public boolean isWinning(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        // check if the current row is present in map
        if(!colMaps.containsKey(col)){
            colMaps.put(col, new HashMap<>());
        }
        Map<Symbol, Integer> colCountMap = colMaps.get(col);

        // check if the symbol is present in the row
        if(!colCountMap.containsKey(symbol)) {
            colCountMap.put(symbol, 0);
        }

        colCountMap.put(symbol, colCountMap.get(symbol) + 1);

        return colCountMap.get(symbol) == board.getDimension();
    }
}
