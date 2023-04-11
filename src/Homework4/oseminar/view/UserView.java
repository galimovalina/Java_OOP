package Homework4.oseminar.view;

import Homework4.oseminar.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
