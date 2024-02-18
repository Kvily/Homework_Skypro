package hw10_objects_and_classes;

public class Main {

    public static void main(String[] args) {
        Author oneAuthor = new Author("Лев", "Толстой");
        Book oneBook = new Book(oneAuthor, "Война и Мир", 1867);

        Author twoAuthor = new Author("Иван", "Тургенев");
        Book twoBook = new Book(twoAuthor, "Отцы и дети", 1862);

        System.out.println(oneBook);
        oneBook.setYearBook(2021);

        System.out.println(" ___________________________");

        System.out.println(twoBook);

        System.out.println(" ___________________________");

        Author oneNameEquals = new Author("Имя автора", "Фамилия ");
        Author twoNameEquals = new Author("Имя автора", "Фамилия автора");

        if (oneNameEquals.equals(twoNameEquals) == false){
            System.out.println("Имена авторов не равны");
        } else {
            System.out.println("Имена авторов равны");
        }

        System.out.println(" ___________________________");
        Book oneBookEquals = new Book(oneAuthor, "Война и Мир", 1867);
        Book twoBookEquals = new Book(twoAuthor, "Война и Мир", 1867);
        System.out.println(twoBookEquals.equals(twoBookEquals));
    }
}
