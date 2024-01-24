package hw8_arrays_lesson1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ///Задача 2
        //*Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.*//
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 0, 0]

        float[] arr2 = new float[5];
        arr2[0] = 12.78f;
        arr2[3] = 612.5948f;
        arr2[4] = 492.4873f;
        System.out.println(Arrays.toString(arr2)); //[12.78, 0.0, 0.0, 612.5948, 492.4873]

        char[] arr3 = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(Arrays.toString(arr3)); //[H, e, l, l, o]
    }
}
