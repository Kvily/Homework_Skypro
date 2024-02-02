package hw8_arrays_lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }
        public static int[] generateRandomArray() {
            Random random = new Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000 + 1) + 100_000;
            }
            return arr;
        }
    public static void task1() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        //Задача 1
        //*Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Сумма трат за месяц составила … рублей».
        // Вычисления выполнили корректно.
        // Результат вычислений вывели в консоль.
        // Код написали без ошибок.
        // Выполнили все условия задания.*//
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за меясц составила - "+ sum + " рублей.");

//        for( int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
    }
}


