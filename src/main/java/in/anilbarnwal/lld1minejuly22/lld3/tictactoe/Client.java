package in.anilbarnwal.lld1minejuly22.lld3.tictactoe;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.controllers.GameController;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.GameStatus;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Player;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.PlayerType;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Symbol;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.services.winningstrategies.ColumnWinningStrategy;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.services.winningstrategies.DiagonalWinningStrategy;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.services.winningstrategies.RowWinningStrategy;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.services.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        playTicTacToes();
    }

    private static void playTicTacToes() {

        //Created Players
        List<Player> players = new ArrayList<>();
        players.add(new Player("Anil", new Symbol('A'), PlayerType.HUMAN));
        players.add(new Player("Aanya", new Symbol('B'), PlayerType.HUMAN));

        //Winning Strategies
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        GameController gameController = new GameController();
        gameController.startGame(players, winningStrategies);

        while(gameController.getGameService().getGame().getGameStatus() == GameStatus.IN_PROGRESS){
            gameController.makeMove();
            gameController.printBoard();
        }

        System.out.println("Game Over!");

//        gameController.printBoard();

        //Check winner /Draw
        Player winnerPlayer = gameController.getGameService().getGame().getWinningPlayer();
        if(gameController.getGameService().getGame().getGameStatus() == GameStatus.ENDED){
            System.out.println(winnerPlayer.getName() + " is a winner");
        }else{
            System.out.println("Oops, Game DRAW!");
        }

    }
}
