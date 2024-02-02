package hw8_arrays_lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void task3() {
        //Задача 3
        //*Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        //
        //Напишите программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате:
        // «Средняя сумма трат за месяц составила … рублей».
        //
        //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
        //Среднюю сумму трат нашли корректно.
        //При изменении данных массива программа работает корректно и выдает верный результат.
        //В коде учтено, что средняя сумма трат может быть как целым, так и дробным числом.*//
        int[] arr = generateRandomArray();
        int sumArr = 0;
        double midArr = 0;
        for (int i : arr) {
            sumArr += i;
        }
        midArr =  (double) sumArr / arr.length;
        System.out.println("Сумма трат за меясц составила - " + sumArr + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила - " + midArr + " рублей.");
    }
    public static void main(String[] args) {
        task3();
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
