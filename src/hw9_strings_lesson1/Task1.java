package hw9_strings_lesson1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        //Задача 1
        //*Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате.
        // Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
        //
        //Напишите четыре строки:
        //
        //С именем firstName — для хранения имени.
        //С именем middleName — для хранения отчества.
        //С именем lastName — для хранения фамилии.
        //С именем fullName — для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество».
        //Выведите в консоль фразу: «Ф. И. О. сотрудника — …».
        //
        //В качестве данных для задачи используйте Ivanov Ivan Ivanovich.*//

//        String firstName = "Ivan";
//        String middleName = "Ivanovich";
//        String lastName = "Ivanov";
//        String fullName = firstName + middleName + lastName;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String firstName = scan.nextLine();

        System.out.print("Введите фамилию: ");
        String lastName = scan.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scan.nextLine();

        String fullname = String.join(" ", lastName, firstName, middleName);
        System.out.println(fullname);

    }
}

