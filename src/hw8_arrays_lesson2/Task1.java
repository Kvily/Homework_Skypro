package hw8_arrays_lesson2;
public class Task1 {
    public static void main(String[] args) {
        task1();
    }
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    public static void task1() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»

    }
}


