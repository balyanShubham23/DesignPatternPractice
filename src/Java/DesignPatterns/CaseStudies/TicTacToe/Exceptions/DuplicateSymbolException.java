package Java.DesignPatterns.CaseStudies.TicTacToe.Exceptions;

public class DuplicateSymbolException extends RuntimeException{

    public DuplicateSymbolException(Character character){
        System.out.println("Symbol "+ character + "is repeated twice.");
    }
}
