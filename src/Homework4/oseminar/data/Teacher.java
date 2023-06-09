package Homework4.oseminar.data;

import java.util.Comparator;

/**
 * Принцип единственной ответственности. Класс отвечает только за создание экземпляра учителя и операций с ним
 */
public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
