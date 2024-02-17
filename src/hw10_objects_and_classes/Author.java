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

    public  String getSurnameAuthor(){
        return  this.surnameAuthor;
    }
}
