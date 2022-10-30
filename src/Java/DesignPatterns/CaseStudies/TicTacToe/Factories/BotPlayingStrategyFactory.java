package Java.DesignPatterns.CaseStudies.TicTacToe.Factories;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.BotDifficultyLevel;
import Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.BotPlayingStrategy.BotPlayingStrategy;
import Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.BotPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(BotDifficultyLevel botDifficultyLevel)
    {
        return new RandomBotPlayingStrategy();
    }
}
