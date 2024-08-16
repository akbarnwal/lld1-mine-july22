package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.services.winningstrategies;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Board;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Move;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{

    private Map<Integer, Map<Symbol, Integer>> rowMaps = new HashMap<>();

    @Override
    public boolean isWinning(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        // check if the current row is present in map
        if(!rowMaps.containsKey(row)){
//            rowMap.put(move.getPlayer().getSymbol(), 0);
            rowMaps.put(row, new HashMap<>());
        }
        Map<Symbol, Integer> rowCountMap = rowMaps.get(row);

        // check if the symbol is present in the row
        if(!rowCountMap.containsKey(symbol)) {
            rowCountMap.put(symbol, 0);
        }

        rowCountMap.put(symbol, rowCountMap.get(symbol) + 1);

        return rowCountMap.get(symbol) == board.getDimension();
    }
}