package Homework5.Service;

import Homework5.Model.Account;
import Homework5.Model.UserAccount;

import java.util.Scanner;

public class AccountService {
    Account account=new Account();

    public Account createNewAccount(){
        Account account=new Account(0);
        return account;
    }

    public void addMoney() {
        System.out.println("Введите сумму для зачисления на счет: ");
        Scanner scanner = new Scanner(System.in);
        account.setBalance(account.getBalance()+scanner.nextInt());
    }

    public void withdrawMoney(){
        System.out.println("Введите сумму для снятия со счета: ");
        Scanner scanner = new Scanner(System.in);
        account.setBalance(account.getBalance()+scanner.nextInt());
    }
}
