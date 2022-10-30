package Java.DesignPatterns.CaseStudies.TicTacToe.Factories;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.GameWinningStrategyName;

public class GameWinningStrategyNameEnumFactory {

    public static GameWinningStrategyName getGameWinningStrategyNameFromString(String name)
    {
        if(name.equals("ROW"))
        {
            return GameWinningStrategyName.Row;
        }
        return GameWinningStrategyName.Corners;
    }
}
