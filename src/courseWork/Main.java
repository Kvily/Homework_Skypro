package courseWork;

import courseWorkTest1.Employee1;

public class Main {
    private final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee[] emplCorp = new Employee[10];
        emplCorp[0] = new Employee("Иванов Иван Иванович", 5, 10350);
        emplCorp[1] = new Employee("Жилина Арина Руслановна", 1, 12000);
        emplCorp[2] = new Employee("Воробьева Елизавета Александровна", 2, 37365);
        emplCorp[3] = new Employee("Третьяков Илья Максимович", 4, 39562);
        emplCorp[4] = new Employee("Борисова Полина Мартиновна", 4, 19610);
        emplCorp[5] = new Employee("Жуков Владимир Алексеевич", 3, 61253);
        emplCorp[6] = new Employee("Николаев Даниил Миронович", 2, 80060);
        emplCorp[7] = new Employee("Степанов Илья Сергеевич", 1, 71300);
        emplCorp[8] = new Employee("Медведева Мирослава Дмитриевна", 2, 49150);
        emplCorp[9] = new Employee("Волкова Елизавета Львовна", 3, 34900);

        printSeparator();
        printListAllEmployee(emplCorp);  //а
        printSeparator();
        calculateAllSalary(emplCorp);    //b
        printSeparator();
        calculateMinSalary(emplCorp);    //c
        printSeparator();
        calculateMaxSalary(emplCorp);    //d
        printSeparator();
        calculateMediumSalary(emplCorp); //e
        printSeparator();
        listEmployee(emplCorp);          //f
        printSeparator();
    }

    public static void listEmployee(Employee[] employees) {
        System.out.println("ФИО сотрудников фирмы:");
        for (Employee i : employees) {
            if (i != null) {
                System.out.println(i.getNameFull());
            }
        }
    }

    public static void printListAllEmployee(Employee[] employees) {
        System.out.println("Список сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static int calculateAllSalary(Employee[] employees) {
        System.out.print("Зарплата всех сотрудников за месяц: ");
        double allSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalary += +employees[i].getSalary();
        }
        System.out.println(allSalary + " рублей.");
        return (int) allSalary;
    }

    public static int calculateMinSalary(Employee[] employees) {
        System.out.print("Минимальная зарплата: ");
        double minSalary = employees[0].getSalary();
        int minSalIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                minSalIndex = i;
            }
        }
        System.out.println(minSalary + " рублей. Сотрудник - " +
                employees[minSalIndex].getNameFull());
        return (int) minSalary;
    }

    public static int calculateMaxSalary(Employee[] employees) {
        System.out.print("Максимальная зарплата: ");
        double maxSalary = employees[0].getSalary();
        int maxSalIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxSalIndex = i;
            }
        }
        System.out.println(maxSalary + " рублей. Сотрудник - " +
                employees[maxSalIndex].getNameFull());
        return (int) maxSalary;
    }

    public static int calculateMediumSalary(Employee[] employees) {
        System.out.print("Средняя зарплата всех сотрудников по офису: ");
        double allSalary = 0;
        double medSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalary = (allSalary + employees[i].getSalary());
        }
        medSalary = allSalary / employees.length;

        System.out.println(medSalary + " рублей.");
        return (int) medSalary;
    }

    public static void printSeparator() {
        System.out.println("*************************************************************************************************");
    }

}
