package Homework2;



// Найти книги, в которых простое количество страниц, фамилия автора содержит «А»
// и год издания после 2010 г, включительно.
public class Main {
    public static void main(String[] args) {

        BookCollection bookList=new BookCollection();
        bookList.addBook(new Book("Зима", "Петров", 43, 350, "Эксмо", 2008, "Москва"));
        bookList.addBook(new Book("Весна", "Иванов", 59, 239, "Лабиринт", 2010, "Санкт-Петербург"));
        bookList.addBook(new Book("Лето", "Михалков", 250, 420, "Миф",2011,"Воронеж"));
        bookList.addBook(new Book("Осень", "Смирнов", 97, 160, "АСТ", 2012, "Москва"));
        bookList.addBook(new Book("Понедельник", "Андропов", 79, 320, "Просвещение", 2014, "Омск"));
        System.out.println(bookList.Filter());


    }
}
