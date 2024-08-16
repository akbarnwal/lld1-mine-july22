package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.controllers;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.Player;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.services.GameService;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.strategies.winningstrategies.WinningStrategy;
import lombok.Getter;

import java.util.List;

@Getter
public class GameController {
    private GameService gameService;

    public void startGame(List<Player>players, List<WinningStrategy> winningStrategies){
        gameService = new GameService();
        gameService.startGame(players, winningStrategies);
    }

    public void makeMove(){
        gameService.makeMove();

    }

    public void printBoard(){
        gameService.printBoard();

    }

    public void getWinner(){
        gameService.getWinner();

    }


}
