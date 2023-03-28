package Seminar_1.Cat;

/**
 * Инкапсуляция - объединение данных и методов, скрыв детали реализации
 */
public class main {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setName("Barsik");
        cat.setAge(5);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
    }
}
