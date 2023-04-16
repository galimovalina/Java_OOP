package Homework5;

import Homework5.Controller.UserAccountController;
import Homework5.Model.User;
import Homework5.Model.UserAccount;

public class Main {
    public static void main(String[] args) {
        UserAccountController userAccController=new UserAccountController();
        User user1=new User(1, "Natasha", "Ivanova", "Sergeevna");
        userAccController.saveNewUser(user1);
        UserAccount userAccount1=new UserAccount(user1);
        userAccController.addMoney(userAccount1);
        System.out.println(userAccount1);
        userAccController.withdrawMoney(userAccount1);
        System.out.println(userAccount1);
        System.out.println(userAccController.getUser(user1));
        userAccController.deleteUser(user1);
        System.out.println(userAccController.getUser(user1));
    }
}
