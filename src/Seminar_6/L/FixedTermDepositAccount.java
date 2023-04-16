package Seminar_6.L;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account{
    @Override
    protected void withdraw(float amount) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void deposit(float amount) {
        //Deposit into this account
    }
}
