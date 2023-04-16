package Seminar_6.L;

import java.math.BigDecimal;

public class BankingAppWithdrawService {
    private NewClass account;

    public BankingAppWithdrawService(NewClass account) {
        this.account = account;
    }
    protected void withdraw(float amount){
        account.withdraw(amount);
    }
}
