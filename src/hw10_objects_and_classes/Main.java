package hw10_objects_and_classes;

public class Main {
    public static void main(String[] args) {

        Author oneAuthor = new Author("Лев", "Толстой");
        Book oneBook = new Book(oneAuthor.getFirstnameAuthor(), "Война и Мир", 1867);

        Author twoAuthor = new Author("Иван", "Тургенев");
        Book twoBook = new Book(oneAuthor.getFirstnameAuthor(), "Отцы и дети", 1862);

        System.out.println("Имя автора: " + oneAuthor +
                "\nНазвание книги: " + oneBook.getNameBook() +
                "\nГод издания: " + oneBook.getYearBook());

        oneBook.setYearBook(2021);
        System.out.println("Год издания: " + oneBook.getYearBook());

        System.out.println("___________________________");
        System.out.println("Имя автора: " + twoAuthor +
                "\nНазвание книги: " + twoBook.getNameBook() +
                "\nГод издания: " + twoBook.getYearBook());
    }
}
