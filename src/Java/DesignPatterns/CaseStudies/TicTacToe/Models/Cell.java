package Java.DesignPatterns.CaseStudies.TicTacToe.Models;

public class Cell {

    private int row;

    private int column;

    private Player player;

    public Cell(int i , int j)
    {
        this.row = i;
        this.column = j;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
