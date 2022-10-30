package Java.DesignPatterns.Adapter;

import Java.DesignPatterns.Adapter.ThirdParty.ICICIBank.ICICIBankAPI;

public class ICICIBankAdapter  implements BankAPIAdapter{

    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public int getBalance(String AccountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String FromAcc, String ToAcc, double Amount) {
        return false;
    }
}
