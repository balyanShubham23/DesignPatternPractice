package Java.DesignPatterns.Decorator;

public class Pepperoni implements IPizza{

    IPizza pizza;

    public Pepperoni()
    {

    }

    public Pepperoni(IPizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if(pizza != null)
        {
            return this.pizza.getCost() + 180;
        }
        return 180;
    }

    @Override
    public String getDescription() {
        if(pizza != null)
        {
            return this.pizza.getDescription() + " + Pepperoni";
        }
        return "Pepperoni";
    }
}
