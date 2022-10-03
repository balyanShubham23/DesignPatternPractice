package Java.DesignPatterns.Decorator;

public class BBQChicken implements IPizza{

    IPizza pizza;

    public BBQChicken()
    {

    }

    public BBQChicken(IPizza pizza)
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
            return this.pizza.getDescription() + " + BBQChicken";
        }
        return "BBQChicken";
    }
}
