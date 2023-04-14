package Homework2;


//Класс Публикуемый материал


import java.util.List;

public abstract class Note implements PrimePages{
    protected String name;
    protected String author;
    protected int pages;
    protected int price;


    public Note(String name, String author, int pages, int price) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }


    @Override
    public abstract boolean isPrime(int pages);



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
