package Homework2;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Library {
    protected List<Book> books=new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Найти книги, в которых простое количество страниц, фамилия автора содержит «А»
     * и год издания после 2010 г, включительно.
     **/

    public Book Filter() {
        for (Book book : books) {
            if (book.isPrime(book.getPages()) && book.getAuthor().toLowerCase().contains("а") && book.getPublishingYear() >= 2010) {
                return book;
            }
        }
        return null;
    }
}
