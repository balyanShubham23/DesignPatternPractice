package Java.DesignPatterns.Adapter;

public class PhonePay {
    private  BankAPIAdapter bankAPI;

    public  PhonePay(BankAPIAdapter API){
        this.bankAPI = API;
    }


}
