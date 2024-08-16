package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.services;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.*;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.strategies.winningstrategies.WinningStrategy;
import lombok.Getter;

import java.util.List;

@Getter
public class GameService {
    private Game game;

    public void startGame(List<Player> players, List<WinningStrategy> winningStrategies) {
        game = Game.getBuilder()
                .setPlayers(players)
                .setWinningStraties(winningStrategies)
                .build();

    }

    public void makeMove() {
        Player currentPlayer = game.getPlayers().get(game.getNextPlayerIndex());
        Cell moveCell = currentPlayer.makeMove(game.getBoard());

        // valid move, we can execute on the board
        Cell currentCell = game.getBoard().getBoard().get(moveCell.getRow()).get(moveCell.getCol());
        currentCell.setCellState(CellState.FILLED);
        currentCell.setPlayer(currentPlayer);
        Move finalMove = new Move(currentCell, currentPlayer);
        game.getMoves().add(finalMove);

        // set the next player index
        int currPlayerIndex = game.getNextPlayerIndex();
        int nextPlayerIndex = (currPlayerIndex + 1) % game.getPlayers().size();
        game.setNextPlayerIndex(nextPlayerIndex);

        //Checking winner or draw
        if(checkWinner(finalMove)){
            game.setWinningPlayer(currentPlayer);
            game.setGameStatus(GameStatus.ENDED);
        }else if(game.getMoves().size() == game.getBoard().getDimension() * game.getBoard().getDimension()){
            game.setGameStatus(GameStatus.DRAW);
        }
    }

    private boolean checkWinner(Move finalMove) {
        for(WinningStrategy winningStrategy: game.getWinningStrategies()){
            if(winningStrategy.isWinning(game.getBoard(), finalMove)){
                return true;
            }
        }
        return false;
    }

    public void printBoard() {
        List<List<Cell>> board = game.getBoard().getBoard();
        for(List<Cell> cells : board){
            for(Cell cell : cells){
                if(cell.getCellState() == CellState.EMPTY){
                    System.out.print("| |");
                }else {
                    System.out.printf("| " + cell.getPlayer().getSymbol().getSymbol() +" |");
                }
            }
            System.out.println();
        }

    }

    public void getWinner() {

    }
}
