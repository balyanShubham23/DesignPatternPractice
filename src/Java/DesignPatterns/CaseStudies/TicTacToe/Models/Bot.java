package Java.DesignPatterns.CaseStudies.TicTacToe.Models;

import Java.DesignPatterns.CaseStudies.TicTacToe.Factories.BotPlayingStrategyFactory;
import Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.BotPlayingStrategy.BotPlayingStrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    private BotPlayingStrategy botPlayingStrategy;

    public Bot(BotDifficultyLevel botDifficultyLevel)
    {

        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(this.botDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        return this.botPlayingStrategy.makeMove(board, this);
    }

}
