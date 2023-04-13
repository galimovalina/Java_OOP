package Seminar_5.Service;

import Seminar_5.Repositorium.UserRepo;
import Seminar_5.model.User;

public class UserService {
    private UserRepo userRepo=new UserRepo();
    public void saveUser(User user){
        userRepo.addToList(user);
    }
    public void deleteUser(User user){
        userRepo.deleteUser(user);
    }

    public User getUser(User user){
        return userRepo.getUser(user);
    }

}
