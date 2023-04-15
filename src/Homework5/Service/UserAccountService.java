package Homework5.Service;

import Homework5.Model.Account;
import Homework5.Model.User;
import Homework5.Model.UserAccount;

import java.util.Scanner;

public class UserAccountService {
    private UserAccount userAccount;
    public UserAccount createNewUserAccount(User user){
        UserAccount userAccount=new UserAccount(user,0);
        return userAccount;
    }

    public UserAccount getUserAccount(){
        return userAccount;
    }
    public void addMoney(UserAccount userAccount){
        System.out.println("Введите сумму для зачисления на счет: ");
        Scanner scanner = new Scanner(System.in);
        userAccount.setBalance(userAccount.getBalance()+scanner.nextInt());
    }

}
