package Java.DesignPatterns.Decorator;

public class Farmhouse implements IPizza{

    IPizza pizza;

    public Farmhouse()
    {

    }

    public Farmhouse(IPizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if(pizza != null)
        {
            return this.pizza.getCost() + 150;
        }
        return 150;
    }

    @Override
    public String getDescription() {
        if(pizza != null)
        {
            return this.pizza.getDescription() + " + Farmhouse";
        }
        return "Farmhouse";
    }
}
