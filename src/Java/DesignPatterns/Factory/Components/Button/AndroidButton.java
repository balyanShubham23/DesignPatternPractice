package Java.DesignPatterns.Factory.Components.Button;

public class AndroidButton implements Button{

    @Override
    public void ChangeSize() {
        System.out.println("in android button");
    }
}
