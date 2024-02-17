package hw9_strings_lesson1;

public class Task2 {
    public static void main(String[] args) {
        //Задача 2
        //*Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,
        // полностью написанные заглавными буквами (верхним регистром).
        //
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с Ivanov Ivan Ivanovich
        // на полностью заглавные буквы.
        //
        //В качестве строки с исходными данными используйте строку fullName
        //Результат программы выведите в консоль в формате: «Данные Ф. И. О. сотрудника для заполнения отчета — …».*//
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
}
