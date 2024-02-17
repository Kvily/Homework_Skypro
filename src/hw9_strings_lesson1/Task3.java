package hw9_strings_lesson1;

public class Task3 {
    public static void main(String[] args) {
        //Задача 3
        //*Система, в которой мы работаем, не принимает символ «ё».
        // Напишите программу, которая заменяет символ «ё» на символ «е».
        //
        //В качестве исходных данных используйте строку fullName
        // и данные в ней — «Иванов Семён Семёнович».
        //
        //Выведите результат программы в консоль в формате: «Данные Ф. И. О. сотрудника — ...».*//
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;


        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}
