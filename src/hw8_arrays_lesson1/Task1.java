package hw8_arrays_lesson1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //Задача 1
        //*Объявите три массива:
        //
        //1) Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new
        //2) Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        //3) Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        // с помощью ключевого слова или сразу заполненный элементами.*//
        System.out.println("Целочисленный массив:");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(Arrays.toString(arr1));

        System.out.println("Дробный массив:");
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(arr2));

        System.out.println("Произвольный массив:");
        boolean[] arr = new boolean[5];

        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = true;
        }
        System.out.println(Arrays.toString(arr));



    }
}