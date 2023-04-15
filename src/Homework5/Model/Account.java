package Homework5.Model;

public class Account {

    private Integer balance;

    public Account(Integer balance) {
        this.balance = balance;
    }
    public Account(){

    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return " " + balance;
    }
}
