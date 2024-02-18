package hw10_objects_and_classes;

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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author nameEquals = (Author) other;
        return firstnameAuthor.equals(nameEquals.firstnameAuthor) && surnameAuthor.equals(nameEquals.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstnameAuthor);
    }
}
