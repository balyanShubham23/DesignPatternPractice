package Java.DesignPatterns.CaseStudies.TicTacToe.Factories;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.BotDifficultyLevel;

public class BotDifficultyLevelFactory {

    public static BotDifficultyLevel getBotDifficultyLevelByName(String name)
    {
        if(name.equals("EASY"))
        {
            return BotDifficultyLevel.Easy;
        }
        return BotDifficultyLevel.Medium;
    }
}
