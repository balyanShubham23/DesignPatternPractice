package Java.DesignPatterns.CaseStudies.TicTacToe;

import Java.DesignPatterns.CaseStudies.TicTacToe.Factories.BotDifficultyLevelFactory;
import Java.DesignPatterns.CaseStudies.TicTacToe.Factories.GameWinningStrategyNameEnumFactory;
import Java.DesignPatterns.CaseStudies.TicTacToe.Factories.PlayerFactory;
import Java.DesignPatterns.CaseStudies.TicTacToe.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Players?");
        int numberofPlayers = scanner.nextInt();

        System.out.println("How Many BOTS?");
        int numberofBots = scanner.nextInt();

        List<Player> players = new ArrayList<>();
        for(int i = 0 ; i < numberofBots ; i++)
        {
            System.out.println("Name of Bot : " + (i+1));
            String botName = scanner.next();

            System.out.println("Symbol of Bot : " + (i+1));
            Character botSymbol = scanner.next().charAt(0);

            System.out.println("Difficulty of Bot : " + (i+1));
            String botDifficulty = scanner.next();
            BotDifficultyLevel botDifficultyLevel = BotDifficultyLevelFactory.getBotDifficultyLevelByName(botDifficulty);

            players.add(PlayerFactory.createBot(botName,botSymbol, botDifficultyLevel));
        }

        for(int i = numberofBots ; i < numberofPlayers ; i++)
        {
            System.out.println("Name of Players : " + (i-numberofBots+1));
            String botName = scanner.next();

            System.out.println("Symbol of Players : " + (i-numberofBots+1));
            Character botSymbol = scanner.next().charAt(0);

            players.add(PlayerFactory.createHumanPlayer(botName,botSymbol));
        }

        System.out.println("How Many Winning Strategies?");
        Integer winningStrategyCount = scanner.nextInt();

        List<GameWinningStrategyName> gameWinningStrategyNames = new ArrayList<>();
        for(int i = 0 ; i < winningStrategyCount ; i++)
        {
            System.out.println("Name Strategy : " + (i+1));
            gameWinningStrategyNames.add(GameWinningStrategyNameEnumFactory.getGameWinningStrategyNameFromString(scanner.next()));
        }

        Game game = Game.getBuilder().
                setGameWinningStrategies(gameWinningStrategyNames).
                setPlayers(players).Build();

        while(game.getGameStatus().equals(GameStatus.In_Progress))
        {
            game.MakeMove();
        }
    }
}
