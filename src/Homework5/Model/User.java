package Homework5.Model;

public class User {


    private Integer id;
    private String name;
    private String surname;
    private String patronymic;


    @Override
    public String toString() {
        return  "Пользователь: "+"id=" + id +
                ", Имя ='" + name + '\'' +
                ", Фамилия ='" + surname + '\'' +
                ", Отчество ='" + patronymic + '\'';
    }

    public User(Integer id, String name, String surname, String patronymic) {
        this.id=id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

}
