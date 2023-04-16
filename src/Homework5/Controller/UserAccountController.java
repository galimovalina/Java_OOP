package Homework5.Controller;

import Homework5.Model.User;
import Homework5.Model.UserAccount;
import Homework5.Service.UserAccountService;
import Homework5.Service.UserService;
import Homework5.View.UserAccountView;

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
    public User getUser(User user){
        return userService.getUser(user);
    }
    public UserAccount createNewUserAccount(User user){
        return userAccService.createNewUserAccount(user);
    }
    public void addMoney(UserAccount userAcc){
        userAccService.addMoney(userAcc);
    }
    public void withdrawMoney(UserAccount userAcc) {
        userAccService.withdrawMoney(userAcc);
    }




}
