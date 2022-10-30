package Java.DesignPatterns.Observer;

public class Client {

    public static void main(String[] args) {
        FlipKart flipKart = FlipKart.getInstance();

        EmailSender emailSender = new EmailSender();
        InvoiceGenerator invoice = new InvoiceGenerator();

        flipKart.orderPaced();

    }
}
