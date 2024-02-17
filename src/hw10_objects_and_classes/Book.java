package hw10_objects_and_classes;

public class Book {
    private String nameBook;
    public int yearBook;
    private Author author;

    public Book(String authorBook, String nameBook, int yearBook) {
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
    public Author getAuthor (){
        return this.author;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
