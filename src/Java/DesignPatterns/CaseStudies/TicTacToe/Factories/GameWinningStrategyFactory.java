package Java.DesignPatterns.CaseStudies.TicTacToe.Factories;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.GameWinningStrategyName;
import Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.GameWinningStrategy.GameWinningStrategy;
import Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.GameWinningStrategy.NotGonnaWonGameWinningStrategy;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy getGameWinningStrategyByName(GameWinningStrategyName gameWinningStrategyName)
    {
        return new NotGonnaWonGameWinningStrategy();
    }
}
