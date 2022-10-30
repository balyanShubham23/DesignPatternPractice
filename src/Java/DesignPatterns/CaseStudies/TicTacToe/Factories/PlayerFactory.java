package Java.DesignPatterns.CaseStudies.TicTacToe.Factories;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.*;

public class PlayerFactory {
    public static Player createHumanPlayer(String name, Character character)
    {
        Player player = new Player();
        player.setName(name);
        player.setSymbol(new Symbol(character.charValue()));
        player.setPlayerType(PlayerType.Human);
        return player;
    }

    public static Player createBot(String name, Character character, BotDifficultyLevel botDifficultyLevel)
    {
        Bot bot = new Bot(botDifficultyLevel);
        bot.setName(name);
        bot.setSymbol(new Symbol(character.charValue()));
        bot.setPlayerType(PlayerType.Bot);
        return bot;
    }
}
