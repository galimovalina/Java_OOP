package Homework5.Model;

public class UserAccount {
    private User user;
    private Integer balance;

    public UserAccount(User user) {
        this.user = user;
        this.balance = 0;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return user + ", баланс счета =" + balance;
    }


}
