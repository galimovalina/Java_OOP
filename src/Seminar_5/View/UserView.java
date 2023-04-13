package Seminar_5.View;

import Seminar_5.Controller.UserController;
import Seminar_5.model.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController=new UserController();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter ur data");
        User user1=new User(scanner.nextInt(), scanner.next(), scanner.nextInt());
        userController.saveNewUser(user1);
        userController.getUser(user1);

    }
}
