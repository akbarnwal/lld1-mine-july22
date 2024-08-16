package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models;


import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.services.winningstrategies.WinningStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Game {
//Builder pattern
    private List<Player> players;
    private List<WinningStrategy> winningStrategies;
    private List<Move> moves;
    private int nextPlayerIndex;
    private Board board;
    private Player winningPlayer;
    private GameStatus gameStatus;


    private Game(List<Player> players, List<WinningStrategy> winningStrategies){
        this.players = players;
        this.winningStrategies = winningStrategies;
        moves = new ArrayList<>();
        int dimension = players.size() + 1;
        board = new Board(dimension);
        Random random = new Random();
        nextPlayerIndex = random.nextInt(players.size());
        gameStatus = GameStatus.IN_PROGRESS;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setPlayers(List<Player> players){
            this.players = players;
            return this;
        }

        public Builder setWinningStraties(List<WinningStrategy> winningStrategies){
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game build(){
            validate();
            return new Game(players, winningStrategies);
        }

        private IllegalAccessError validate() {
            if(players == null || players.size() < 2){
                return new IllegalAccessError("Players should min 2");
            }else if(winningStrategies == null || winningStrategies.isEmpty()){
                return new IllegalAccessError("Winning strategy should be min 1");
            }
            return null;
        }


    }

}
