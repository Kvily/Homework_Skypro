package course2.lesson5_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            hereWillBeTrouble("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Не верно указаны входные данные");
        } finally {
            System.out.println("Проверка завершена");
        }
    }

    public static void hereWillBeTrouble(String login, String password, String confirmPassword) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин");
        } else if (!login.matches("\\w+")) {
            throw new WrongLoginException("Логин должен содержать в себе только латинские буквы, цифры и знак подчеркивания");
        }
//        else {
//            System.out.println("Данные введены верно");
//        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Слишком длинный пароль");
        } else if (!password.matches("\\w+")) {
            throw new WrongPasswordException("Пароль должен содержать в себе только латинские буквы, цифры и знак подчеркивания");
        }

        if (password != confirmPassword) {
            throw new WrongPasswordException("Пароли не равны");
        }

    }

}

