package Seminar_5.Controller;

import Seminar_5.Service.UserService;
import Seminar_5.model.User;

public class UserController {
   private  UserService userService=new UserService();
//    public void saveNewUser (int id,String name, int age){
//        userService.saveUser(new User(id,name, age));
//    }
public void saveNewUser (User user){
        userService.saveUser(user);
    }

    public void deleteUser(User user){
        userService.deleteUser(user);
    }

    public User getUser(User user){
        return userService.getUser(user);
    }
}
