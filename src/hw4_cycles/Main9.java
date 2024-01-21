package hw4_cycles;

public class Main9 {
    public static void main(String[] args) {
        //Задача 9
        //*Перепишите решение задачи выше при условии,
        // что деньги вы откладывать будете не «в банку»,
        // а в банк под проценты — 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате:
        // «Месяц …, сумма накоплений равна … рублей».
        // 12% годовых — 1% от суммы каждый месяц.
        // Применили цикл for для решения задания.
        // В консоль вывели по порядку суммы накоплений за каждый месяц с учетом процентов по вкладу.
        // Инициализировали переменную для обозначения вклада.
        // Инициализировали переменную для суммы накоплений.*//
        int accumulation = 29000;
        int deposit;

        for (int i = 1; i <= 12; i++) {
            accumulation = accumulation + accumulation/100;
            deposit = accumulation * i;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +  deposit + " рублей. " + "Проценты по вкладу равны " + accumulation);
        }
    }
}
