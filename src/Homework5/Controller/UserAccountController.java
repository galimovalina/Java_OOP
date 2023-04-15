package Homework5.Controller;

import Homework5.Model.Account;
import Homework5.Model.User;
import Homework5.Model.UserAccount;
import Homework5.Service.AccountService;
import Homework5.Service.UserAccountService;
import Homework5.Service.UserService;
import Homework5.View.UserAccountView;
import Homework5.View.UserView;

public class UserAccountController {
    private final UserService userService=new UserService();
    private final UserAccountService userAccService=new UserAccountService();
    private final UserAccountView userAccView=new UserAccountView();

    public void saveNewUser(User user){
        userService.addUser(user);
    }
    public void deleteUser(User user){
        userService.deleteUser(user);
    }
    public void getUser(User user){
        userService.getUser(user);
    }
    public void addMoney(UserAccount userAcc){
        userAccService.addMoney(userAcc);
    }
//    public void withdrawMoney(){
//        accountService.withdrawMoney();
//    }
//    public Account createAccount(){
//        return accountService.createNewAccount();
//    }
    public String createNewUserAccount(User user){
        userAccService.createNewUserAccount(user);
        return userAccView.sendOnConsole(userAccService.getUserAccount());
    }



}
