package Homework4.oseminar.service;

import Homework4.oseminar.data.Student;
import Homework4.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService<T extends Teacher> implements UserService{
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teachers.add(teacher);
    }
}
