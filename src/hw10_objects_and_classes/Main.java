package hw10_objects_and_classes;

public class Main {
    public static void main(String[] args) {
        Author author_1 = new Author("Лев", "Толстой");
        Book book_1 = new Book(author_1.getFirstnameAuthor(), "Война и Мир", 1867);

        Author author_2 = new Author("Иван", "Тургенев");
        Book book_2 = new Book(author_1.getFirstnameAuthor(), "Отцы и дети", 1862);

        System.out.println("Имя автора: " + author_1.getFirstnameAuthor() +
                " " + author_1.getSurnameAuthor() +
                "\nНазвание книги: " + book_1.getNameBook() +
                "\nГод издания: " + book_1.getYearBook());

        book_1.setYearBook(2021);
        System.out.println("Год издания: " + book_1.getYearBook());

        System.out.println("___________________________");
        System.out.println("Имя автора: " + author_2.getFirstnameAuthor() +
                " " + author_2.getSurnameAuthor() +
                "\nНазвание книги: " + book_2.getNameBook() +
                "\nГод издания: " + book_2.getYearBook());
    }
}
