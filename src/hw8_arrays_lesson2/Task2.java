package hw8_arrays_lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void task2() {
        //Задача 2
        //*Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        //«Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        //Минимальное значение нашли корректно.
        //Максимальное значение нашли корректно.
        //При изменении данных массива код работает корректно и выводит верный результат.
        //Результат программы вывели в консоль согласно условию задания.*//

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr); МЕТОД СОРТИРОВКИ
//        System.out.print("Массив по возрастанию: ");
//        for (int number : arr) {
//            System.out.print(number + ", ");
//        }
//        System.out.println("\n\nМинимальная сумма трат за день составила " + arr[0] + " рублей.");
//        var arrMax = arr[arr.length - 1];
//        System.out.println("\nМаксимальная сумма трат за день составила " + arrMax + " рублей.");


        int minArr = arr[0];
        int maxArr = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < minArr) {
                 minArr = arr[i];
             }
             if (arr[i] > maxArr) {
                 minArr = arr[i];
             }
        }
        System.out.println("Максимальная сумма трат за месяц составила " + maxArr + " рублей.");
        System.out.println("Минимальная сумма трат за месяц составила " + minArr + " рублей.");
    }
    public static void main(String[] args) {
        task2();
    }
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000 + 1) + 100_000;
        }
        return arr;
    }
}
