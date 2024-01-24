package hw8_arrays_lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Задача 4
        //*Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //
        //Распечатайте результат преобразования в консоль.*//
        int[] arr1 = {2, 4, 4, 5, 10};
        System.out.print("Начальный массив: ");
        System.out.println(Arrays.toString(arr1));

        System.out.print("Конечный массив - все нечетные элементы: ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr1[i]++;
            }
            System.out.print(arr1[i] + "  ");
        }


        int[] arr2 = {3, 7, 4, 5, 13};
        System.out.print("\n\nНачальный массив: ");
        System.out.println(Arrays.toString(arr2));

        System.out.print("Конечный массив - все четные элементы: ");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 != 0) {
                arr2[i]++;
            }
            System.out.print(arr2[i] + "  ");
        }
    }
}
