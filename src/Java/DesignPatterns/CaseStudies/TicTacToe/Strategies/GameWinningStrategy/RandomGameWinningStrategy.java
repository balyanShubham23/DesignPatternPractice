package Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.GameWinningStrategy;

import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Board;
import Java.DesignPatterns.CaseStudies.TicTacToe.Models.Move;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomGameWinningStrategy implements GameWinningStrategy{

    private List<HashMap<Character, Integer>> rowCharCounts;
    private List<HashMap<Character, Integer>> columnCharCounts;

    private void InitializeCharCounts(Board board)
    {
        rowCharCounts = new ArrayList<>();
        columnCharCounts = new ArrayList<>();

        for(int i = 0 ; i < board.getDimension() ; i++)
        {
            rowCharCounts.add(new HashMap<>());
            columnCharCounts.add(new HashMap<>());
        }
    }

    @Override
    public boolean CheckVictory(Board board, Move lastMove) {
        if(rowCharCounts == null)
        {
            InitializeCharCounts(board);
        }

        int row = lastMove.getRow();
        int col = lastMove.getColumn();

        if(!rowCharCounts.get(row).containsKey(lastMove.getPlayer().getSymbol().getCharacter()))
        {
            rowCharCounts.get(row).put(lastMove.getPlayer().getSymbol().getCharacter(), 0);
        }

        if(!columnCharCounts.get(col).containsKey(lastMove.getPlayer().getSymbol().getCharacter()))
        {
            columnCharCounts.get(col).put(lastMove.getPlayer().getSymbol().getCharacter(), 0);
        }

        rowCharCounts.get(row).put(lastMove.getPlayer().getSymbol().getCharacter(),
                1 + rowCharCounts.get(row).get(lastMove.getPlayer().getSymbol().getCharacter()));

        columnCharCounts.get(col).put(lastMove.getPlayer().getSymbol().getCharacter(),
                1 + columnCharCounts.get(col).get(lastMove.getPlayer().getSymbol().getCharacter()));

        if(rowCharCounts.get(row).get(lastMove.getPlayer().getSymbol().getCharacter()).equals(board.getDimension()))
        {
            return true;
        }
        if(columnCharCounts.get(col).get(lastMove.getPlayer().getSymbol().getCharacter()).equals(board.getDimension()))
        {
            return true;
        }
        return false;
    }
}
