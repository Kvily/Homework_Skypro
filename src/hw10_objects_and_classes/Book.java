package hw10_objects_and_classes;

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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book bookEquals = (Book) other;
        return nameBook.equals(bookEquals.nameBook);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }

}
