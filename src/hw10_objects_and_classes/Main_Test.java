package hw10_objects_and_classes;

public class Main_Test {
    public static void main(String[] args) {
        Person_Test sarah = new Person_Test("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
    }
}