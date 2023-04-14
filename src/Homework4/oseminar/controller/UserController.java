package Homework4.oseminar.controller;

import Homework4.oseminar.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
