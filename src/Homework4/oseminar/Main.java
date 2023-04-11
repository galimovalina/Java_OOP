package Homework4.oseminar;

import Homework4.oseminar.data.Student;
import Homework4.oseminar.data.Teacher;
import Homework4.oseminar.data.User;
import Homework4.oseminar.data.UserComparator;
import Homework4.oseminar.view.StudentView;
import Homework4.oseminar.view.TeacherView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("teacher_1", "teacher_1", "teacher_1", "03.06.1985");
        Teacher teacher2 = new Teacher("teacher_2", "teacher_2", "teacher_2", "11.12.1990");

        UserComparator<User> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1, teacher2));

        StudentView stView1 = new StudentView();
        stView1.sendOnConsole(List.of(new Student("std_1", "std_1", "std_1","21.10.2000"),
                new Student("std_2", "std_2", "std_2","10.03.1999")));

        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(List.of(teacher1, teacher2));
    }

}
