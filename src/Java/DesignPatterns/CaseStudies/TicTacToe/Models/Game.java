package Java.DesignPatterns.CaseStudies.TicTacToe.Models;

import Java.DesignPatterns.CaseStudies.TicTacToe.Exceptions.DuplicateSymbolException;
import Java.DesignPatterns.CaseStudies.TicTacToe.Factories.GameWinningStrategyFactory;
import Java.DesignPatterns.CaseStudies.TicTacToe.Strategies.GameWinningStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private List<Player> players;

    private  Board board;

    private List<Move> moves;

    private List<GameWinningStrategy> gameWinningStrategies;

    public List<GameWinningStrategy> getGameWinningStrategies() {
        return gameWinningStrategies;
    }

    public void setGameWinningStrategies(List<GameWinningStrategy> gameWinningStrategies) {
        this.gameWinningStrategies = gameWinningStrategies;
    }

    private int lastMovedPlayerIndex;

    private GameStatus gameStatus;

    private Player winner;

    private int filledCells = 0;

    private Game(){}

    public static Builder getBuilder()
    {
        return new Builder();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public int getLastMovedPlayerIndex() {
        return lastMovedPlayerIndex;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void MakeMove()
    {
        this.board.Display();

        this.lastMovedPlayerIndex += 1;
        this.lastMovedPlayerIndex %= players.size();
        System.out.println(this.players.get(lastMovedPlayerIndex).getName() + "'s turn");
        Move potenialMove = this.players.get(this.lastMovedPlayerIndex).makeMove(this.board);

        if(this.board.getCell(potenialMove.getRow(), potenialMove.getColumn()).getPlayer() != null)
        {
            System.out.println("Bad Move ! Try Again !!!");
        }

        this.moves.add(potenialMove);
        this.board.getCell(potenialMove.getRow(), potenialMove.getColumn()).setPlayer(this.players.get(lastMovedPlayerIndex));

        filledCells += 1;

        for(GameWinningStrategy gameWinningStrategy: gameWinningStrategies)
        {
            if(gameWinningStrategy.CheckVictory(board, potenialMove))
            {
                gameStatus =GameStatus.Ended;
                winner =this.players.get(lastMovedPlayerIndex);
                return;
            }
        }

        if(filledCells == (this.players.size()+1) * (this.players.size()+1))
        {
            gameStatus = GameStatus.Draw;
        }
    }

    public static class Builder{
        private List<Player> players;
        private List<GameWinningStrategy> gameWinningStrategies;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setGameWinningStrategies(List<GameWinningStrategyName> gameWinningStrategyName) {
            this.gameWinningStrategies = new ArrayList<>();
            for(GameWinningStrategyName gameWinningStrategy : gameWinningStrategyName) {
                this.gameWinningStrategies.add(GameWinningStrategyFactory.getGameWinningStrategyByName(gameWinningStrategy));
            }
            return this;
        }

        public Game Build(){
            Set<Character> alreadyExistingCharacters = new HashSet<Character>();
            for (Player player : players)
            {
                if(alreadyExistingCharacters.contains(player.getSymbol().getCharacter()))
                {
                    throw new DuplicateSymbolException(player.getSymbol().getCharacter());
                }
                alreadyExistingCharacters.add(player.getSymbol().getCharacter());
            }
            Game game = new Game();
            game.gameStatus = GameStatus.In_Progress;
            game.gameWinningStrategies = gameWinningStrategies;
            game.players = players;
            game.moves = new ArrayList<>();
            game.board = new Board(players.size()+1);
            game.lastMovedPlayerIndex = -1;

            return game;
        }
    }
}
