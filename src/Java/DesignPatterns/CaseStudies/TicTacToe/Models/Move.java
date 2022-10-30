package Java.DesignPatterns.CaseStudies.TicTacToe.Models;

public class Move {

    private int row;

    private int column;

    private Player player;

    public Move(int i , int j , Player player)
    {
        this.row = i;
        this.column = j;
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
