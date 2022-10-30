package Java.DesignPatterns.CaseStudies.TicTacToe.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {

private  int dimension;

private List<List<Cell>> board;

public Cell getCell(int row, int column)
{
    return board.get(row).get(column);
}

public Board(int Dimension)
{
    this.dimension = Dimension;
    this.board = new ArrayList<>();

    for(int i = 0 ; i < dimension ; i++)
    {
        this.board.add(new ArrayList<>());
        for(int j = 0 ; j < dimension ; j++)
        {
            this.board.get(i).add(new Cell(i, j));
        }
    }

}

    public void Display()
    {
        for(List<Cell> rows: board)
        {
            for(Cell cell: rows)
            {
                if(cell.getPlayer() == null)
                {
                    System.out.print(" - ");
                }
                else
                {
                    System.out.print(" " + cell.getPlayer().getSymbol().getCharacter() + " ");
                }
            }
            System.out.println();
        }
    }

    public int getDimension() {
        return dimension;
    }

    public List<List<Cell>> getSize() {
        return board;
    }
}
