package Homework2;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Book extends Note {
    private String publishingHouse;
    private int publishingYear;
    private String publishingLocation;
    private List<Book> books;


    public Book(String name, String author, int pages, int price, String publishingHouse, int publishingYear, String publishingLocation) {
        super(name, author, pages, price);
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.publishingLocation = publishingLocation;
    }

    /**
     * @param pages кол-во страниц
     * @return является ли кол-во страниц простым числом
     */
    @Override
    public boolean isPrime(int pages) {
        if (pages < 2) {
            return false;
        }
        double s = sqrt(pages);
        for (int i = 2; i <= s; i++) {
            if (pages % i == 0) {
                return false;
            }
        }
        return true;
    }


    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getPublishingLocation() {
        return publishingLocation;
    }

    public void setPublishingLocation(String publishingLocation) {
        this.publishingLocation = publishingLocation;
    }

    @Override
    public String toString() {
        return  "Книга: " + '\n' +
                "Название: " + name + '\n' +
                "Автор: " + author + '\n' +
                "Кол-во страниц: " + pages + '\n' +
                "Год публикации: " + publishingYear + '\n' +
                "Издательство: " + publishingHouse + '\n' +
                "Город издания: " + publishingLocation + '\n' +
                "Цена: " + price + '\n' + '\n';
    }
}
