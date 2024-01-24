package hw8_arrays_lesson1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //Задача 3
        //*Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        // В конце строки запятую ставить не надо.
        //
        //Если в задаче 2 в консоль у вас вывелся результат:
        //
        //1, 2, 3
        //1.57, 7.654, 9.986
        //// Произвольные элементы третьего массива
        //
        //то в этой задаче результат должен быть таким:
        //
        //3, 2, 1
        //9.986, 7.654, 1.57
        //// Произвольные элементы третьего массива в обратном порядке*//
        int[] arr1 = {2, 3, 4, 5, 9};
        System.out.print("Массив изначально: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Массив в обратном порядке: ");

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }

        double[] arr2 = {9.986, 7.654, 1.57};
        System.out.print("\n\nМассив изначально: ");
        System.out.println(Arrays.toString(arr2));


        System.out.print("Массив в обратном порядке: ");
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + "  ");
        }

        char[] arr3 = {'L', 'I', 'V', 'E'};
        System.out.print("\n\nМассив изначально: ");
        System.out.println(Arrays.toString(arr3));
        System.out.print("Массив в обратном порядке: ");

        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i] + "  ");
        }
    }
}


