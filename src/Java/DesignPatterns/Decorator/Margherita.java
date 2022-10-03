package Java.DesignPatterns.Decorator;

public class Margherita implements IPizza{

    IPizza pizza;

    public Margherita()
    {

    }

    public Margherita(IPizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if(pizza != null)
        {
            return this.pizza.getCost() + 200;
        }
        return 200;
    }

    @Override
    public String getDescription() {
        if(pizza != null)
        {
            return this.pizza.getDescription() + " + Margherita";
        }
        return "Margherita";
    }
}
