package Java.DesignPatterns.Observer;

public class InvoiceGenerator implements ISubscriber{

    public InvoiceGenerator()
    {
        FlipKart.getInstance().RegisterSubscriber(this);
    }
    @Override
    public void Announce() {
        System.out.println("In Invoice Generator");
    }
}
