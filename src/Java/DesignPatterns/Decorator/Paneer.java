package Java.DesignPatterns.Decorator;

public class Paneer implements IPizza{
    IPizza pizza;

    public Paneer(IPizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + Paneer";
    }
}
