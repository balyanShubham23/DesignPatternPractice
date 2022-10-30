package Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.BotPlayingStrategy;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Board;
import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Move;
import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Player;

public interface BotPlayingStrategy {

    public Move makeMove(Board board, Player player);
}
