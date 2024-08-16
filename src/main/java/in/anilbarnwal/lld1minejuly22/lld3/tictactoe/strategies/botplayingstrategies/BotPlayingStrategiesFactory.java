package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.strategies.botplayingstrategies;

import in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models.BotDifficultyLevel;

public class BotPlayingStrategiesFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        return switch (botDifficultyLevel){
            case EASY -> new BotEasyPlayingStrategy();
            case MEDIUM -> new BotMediumPlayingStrategy();
            case HARD -> new BotHardPlayingStrategy();
        };
    }
}
