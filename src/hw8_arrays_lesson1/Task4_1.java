package hw8_arrays_lesson1;

import java.util.Arrays;
import java.util.Scanner; //НАКОНЕЦ-ТО РАЗОБРАЛАСЬ С КЛАССОМ SCANNER !!!Ура!!!

public class Task4_1 {
    public static void main(String[] args) {      

        int[] arr1 = new int[3];
        int i = 0;
        Scanner in = new Scanner(System.in);
        for (int element : arr1)
        {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            arr1[i] = in.nextInt();
            i++;
        }

        System.out.print("\nКонечный массив - все нечетные элементы: ");
        for (int element : arr1) {
            for (int i1 = 0; i1 < arr1.length; i1++) {
                if (arr1[i1] % 2 == 0) {
                    arr1[i1]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));

        //////////////////////////////////

        System.out.println();

        int[] arr2 = new int[3];
        int i3 = 0;
        Scanner in1 = new Scanner(System.in);
        for (int element : arr2)
        {
            System.out.print("Введите " + (i3 + 1) + "-й элемент массива: ");
            arr2[i3] = in1.nextInt();
            i3++;
        }

        System.out.print("\nКонечный массив - все четные элементы: ");
        for (int element : arr2) {
            for (int i2 = 0; i2 < arr2.length; i2++) {
                if (arr2[i2] % 2 != 0) {
                    arr2[i2]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
