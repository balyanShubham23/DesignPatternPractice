package Java.DesignPatterns.Decorator;

public class Cheese implements IPizza{

    IPizza pizza;

    public Cheese(IPizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + Cheese";
    }
}
