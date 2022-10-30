package Java.DesignPatterns.Observer;

public class EmailSender implements  ISubscriber{

    public EmailSender()
    {
        FlipKart.getInstance().RegisterSubscriber(this);
    }
    @Override
    public void Announce() {
        System.out.println("In Email Sender");
    }
}
