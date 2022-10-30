package Java.DesignPatterns.Adapter;

import Java.DesignPatterns.Adapter.ThirdParty.ICICIBank.ICICIBankAPI;
import Java.DesignPatterns.Adapter.ThirdParty.YESBank.YESBankAPI;

public class YESBankAPIAdapter implements BankAPIAdapter{

    private YESBankAPI yesBankApi = new YESBankAPI();
    @Override
    public int getBalance(String AccountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String FromAcc, String ToAcc, double Amount) {
        return false;
    }
}
