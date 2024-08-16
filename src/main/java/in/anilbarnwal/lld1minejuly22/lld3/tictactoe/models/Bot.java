package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models;

import lombok.Getter;

@Getter
public class Bot extends Player {
    private DifficultyLevel difficultyLevel;

    public Bot(String name, Symbol symbol, PlayerType playerType, DifficultyLevel difficultyLevel) {
        super(name, symbol, playerType);
        this.difficultyLevel = difficultyLevel;
    }

}
