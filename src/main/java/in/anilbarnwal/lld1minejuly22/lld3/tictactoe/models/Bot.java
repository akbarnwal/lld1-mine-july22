package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.strategies.botplayingstrategies.BotPlayingStrategiesFactory;
import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;
import lombok.Getter;

@Getter
public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Cell makeMove(Board board){
        System.out.println(this.getName() + "  Bot's turn");
        BotPlayingStrategy botPlayingStrategy = BotPlayingStrategiesFactory.getBotPlayingStrategy(botDifficultyLevel);
        return botPlayingStrategy.makeMove(board);
    }

}
