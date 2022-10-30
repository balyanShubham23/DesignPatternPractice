package Java.DesignPatterns.CaseStudies.TicTacToe.Models;

import java.util.Scanner;

public class Player {

    private Symbol symbol;

    private String name;

    private PlayerType playerType;

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Board board)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What row ( starting from 0)");
        Integer row = scanner.nextInt();

        System.out.println("What column ( starting from 0)");
        Integer column = scanner.nextInt();

        Move move = new Move(row, column, this);

        return move;
    }
}
