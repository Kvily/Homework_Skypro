package courseWork;

import java.util.Objects;

public class Employee {
    private String nameFull;
    private int department;
    private double salary;
    private int id;
    private static int idCounter = 1;

    public Employee(String nameFull, int department, double salary) {
        this.nameFull = nameFull;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getNameFull() {
        return nameFull;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " id: " + id +
                " ФИО сотрудника: " + nameFull +
                " Отдел: " + department +
                " Зарплата сотрудника: " + salary +
                " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(nameFull, employee.nameFull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFull, id);
    }
}
