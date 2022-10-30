package Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.BotPlayingStrategy;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Board;
import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Cell;
import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Move;
import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeMove(Board board, Player player) {
        for(List<Cell> rows: board.getSize())
        {
            for(Cell cell : rows)
            {
                if(cell.getPlayer() == null)
                {
                    return new Move(cell.getRow(), cell.getColumn(), player);
                }
            }
        }
        return null;
    }
}
