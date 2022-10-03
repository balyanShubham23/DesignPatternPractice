package Java.DesignPatterns.Decorator;

public class Olive implements IPizza{

    IPizza pizza;

    public Olive(IPizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + Olive";
    }
}
