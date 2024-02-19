package hw10_objects_and_classes;

import java.util.Objects;

public class Author {
    private String firstnameAuthor;
    private String surnameAuthor;

    public Author(String firstnameAuthor, String surnameAuthor) {
        this.firstnameAuthor = firstnameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getFirstnameAuthor() {
        return this.firstnameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    @Override
    public String toString() {
        return "Автор книги: " + this.firstnameAuthor + " " + this.surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstnameAuthor, author.firstnameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstnameAuthor);
    }
}
