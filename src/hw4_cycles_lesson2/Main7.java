package hw4_cycles_lesson2;

public class Main7 {
    public static void main(String[] args) {
        //Задача 7
        //*В компании пятница — отчетный день.
        //
        //Нужно написать программу, которая считает дни месяца по датам, определяет,
        // какой день — пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        //
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        // «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        //
        //В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с
        // напоминаниями по разным датам.
        //
        // Инициализировали переменную, хранящую в себе дату.
        // Создали цикл.
        //Условия цикла записали корректно.
        //Условия задачи соблюдаются и выполняются.
        //Сообщение в консоль выводится корректно и учитывает все значения переменной.*//
        int friday = 0;
        do {
             friday += 1;
             if (friday % 7 == 0) {
                 System.out.println("Сегодня пятница, " + friday + "-е число, необходимо подготовить отчет");
             }
        }
        while (friday < 31);

    }
}
