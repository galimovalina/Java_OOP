package Homework5.Service;

import Homework5.Model.User;

import java.util.ArrayList;
import java.util.List;


public class UserService {
    private List<User> users=new ArrayList<>();

    public UserService(List<User> users) {
        this.users = users;
    }

    public UserService() {

    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public User getUser(User user) {
        for (User el : users) {
            if (el.getId().equals(user.getId())) {
                return el;
            }
        }
        return null;
    }


}
