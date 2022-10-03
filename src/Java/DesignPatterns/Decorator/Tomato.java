package Java.DesignPatterns.Decorator;

public class Tomato implements IPizza{

    IPizza pizza;

    public Tomato(IPizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + Tomato";
    }
}
