package Java.DesignPatterns.Factory.Components.Button;

public class IosButton implements Button{

    @Override
    public void ChangeSize() {
        System.out.println("in ios button");
    }
}
