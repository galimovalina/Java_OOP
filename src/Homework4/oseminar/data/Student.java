package Homework4.oseminar.data;

import java.time.LocalDate;

/**
 * Принцип единственной ответственности. Класс отвечает только за создание экземпляра ученика и операций с ним
 *
 * Принцип подстановки Барбары Лисков. Класс-потомок Students способен выполнять те же действия,
 * что и класс-родитель User. Любые объекты типа User, присутствующие в программе, могут заменяться
 * объектами типа Students без негативных последствий для функциональности программы.
 */
public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, String dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, String dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
