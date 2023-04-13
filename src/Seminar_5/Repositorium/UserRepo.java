package Seminar_5.Repositorium;

import Seminar_5.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserRepo {
    private List<User> userList=new ArrayList<>();
    public UserRepo(List<User> userList) {
        this.userList = userList;
    }

    public UserRepo(){

    }
    public void addToList(User user){
        userList.add(user);
    }

    public void deleteUser(User user){
        userList.remove(user);
    }

    public User getUser(User user){
        for (User el:userList){
            if (el.getId().equals(user.getId())){
                return el;
            }
        }
        return null;
    }

//    public void saveUser(User user){
//        try(FileWriter fileWriter=new FileWriter("text.txt",false)){
//            fileWriter.write(user.toString());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
