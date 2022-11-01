package Hemework13;

import java.util.Objects;

public class Book {
    private String title;
    private  Author author;
    private int year;


    public  Book(String title, Author author, int year) {


    this.title=title;
    this.author=author;
     this.year=year;
    }

    public String getTitle(){
        return this.title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    public  Author getAuthor(){return this.author;}
    public int getYear(){
        return this. year;
    }
    public int setYear(){return this.year;}

    public String toString(){
        return "название книги - "+ this.title;
    }

}