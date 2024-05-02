package course2.lesson5_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            Validator.hereWillBeTrouble("java_skypro_go&", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Не верно указаны входные данные: " + e.getMessage());
        } finally {
            System.out.println("------------------------------------------");
            System.out.println("Проверка завершена");
            System.out.println("------------------------------------------");
        }
    }
}

