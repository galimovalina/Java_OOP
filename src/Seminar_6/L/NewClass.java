package Seminar_6.L;

import java.math.BigDecimal;

public class NewClass extends Account{
    @Override
    protected void withdraw(float amount) {

    }

    @Override
    protected void deposit(float amount) {
        this.balance+=amount;
    }
}
