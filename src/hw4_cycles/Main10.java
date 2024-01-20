package hw4_cycles;

public class Main10 {
    public static void main(String[] args) {
        //Задача 10
        //*Напишите программу, которая выводит в консоль таблицу умножения на 2:
        //
        //2*1=2
        //
        //2*2=4
        //
        //2*3=6
        //
        //2*4=8
        //
        //2*5=10
        //
        //2*6=12
        //
        //2*7=14
        //
        //2*8=16
        //
        //2*9=18
        //
        //2*10=20
        // В цикле можно использовать не только операцию сложения, но и операцию умножения.*//
        int number = 2;
        int result;
        for (int i = 0; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
