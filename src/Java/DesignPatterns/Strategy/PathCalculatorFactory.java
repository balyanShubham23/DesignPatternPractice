package Java.DesignPatterns.Strategy;

public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculatorStrategyByMode(String Mode)
    {
        if(Mode == "Car")
        {
            return new CarPathCalculatorStrategy();
        }
        else if(Mode == "Bike")
        {
            return new BikePathCalculatorStrategy();
        }
        else
        {
            return  new WalkPathCalculatorStrategy();
        }
    }
}
