package hw10_objects_and_classes;

import java.util.Objects;

public class Book {
    private String nameBook;
    public int yearBook;
    private Author author;

    public Book(Author author, String nameBook, int yearBook) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    @Override
    public String toString() {
        return " Название книги: " + this.nameBook + "\n Год издания: " + this.yearBook + "\n " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }

}
