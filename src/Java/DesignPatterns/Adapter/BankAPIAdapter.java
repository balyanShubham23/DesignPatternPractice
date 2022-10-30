package Java.DesignPatterns.Adapter;

public interface BankAPIAdapter {

    public int getBalance(String AccountNumber);

    boolean sendMoney(String FromAcc, String ToAcc , double Amount);
}
