package Homework5;

import Homework5.Controller.UserAccountController;
import Homework5.Model.Account;
import Homework5.Model.User;
import Homework5.Model.UserAccount;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserAccountController userAccController=new UserAccountController();
        User user1=new User(1, "Natasha", "Ivanova", "Sergeevna");
        userAccController.saveNewUser(user1);
        System.out.println(userAccController.createNewUserAccount(user1));
//        System.out.println(userAccController.createUserAccount(user1,userAccController.createAccount()));
//        userAccController.addMoney();
    }
}
