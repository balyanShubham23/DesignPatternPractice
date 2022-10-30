package Java.DesignPatterns.Strategy;

public class GoogleMaps {

    public void FindPath(String From, String To, String Mode)
    {
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorStrategyByMode(Mode);
        pathCalculatorStrategy.FindPath(From, To);
    }
}
