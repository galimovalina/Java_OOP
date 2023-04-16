package Homework5.Service;

import Homework5.Model.User;
import Homework5.Model.UserAccount;

import java.util.Scanner;

public class UserAccountService {
    private UserAccount userAccount;
    public UserAccount createNewUserAccount(User user){
       return userAccount=new UserAccount(user);
    }

    public void addMoney(UserAccount userAccount){
        System.out.println("Введите сумму для зачисления на счет: ");
        Scanner scanner = new Scanner(System.in);
        userAccount.setBalance(userAccount.getBalance()+scanner.nextInt());
    }
    public void withdrawMoney(UserAccount userAccount){
        System.out.println("Введите сумму для снятия со счета: ");
        Scanner scanner = new Scanner(System.in);
        userAccount.setBalance(userAccount.getBalance()-scanner.nextInt());
    }

}
