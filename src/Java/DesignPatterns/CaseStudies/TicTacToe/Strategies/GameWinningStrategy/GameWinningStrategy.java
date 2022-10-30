package Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.GameWinningStrategy;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Board;
import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Move;

public interface GameWinningStrategy {
    boolean CheckVictory(Board board, Move lastMove);
}
