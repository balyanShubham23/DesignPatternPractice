package Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.GameWinningStrategy;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Board;
import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Move;

public class NotGonnaWonGameWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean CheckVictory(Board board, Move lastMove) {
        return false;
    }
}
