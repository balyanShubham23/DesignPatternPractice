package Java.DesignPatterns.Decorator;

public class Client {

    public static void main(String[] args) {
        IPizza p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p.getCost());
        System.out.println(p.getDescription());
    }
}
