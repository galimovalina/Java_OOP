package Homework5.View;

import Homework5.Model.User;
import Homework5.Model.UserAccount;
import Homework5.Service.UserService;

public class UserView {
    public String sendOnConsole(User user){
        return user.toString();
    }
}
