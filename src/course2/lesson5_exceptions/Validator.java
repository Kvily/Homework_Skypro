package course2.lesson5_exceptions;

public class Validator {
    static void hereWillBeTrouble(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин");
        } else if (!login.matches("\\w+")) {
            throw new WrongLoginException("Логин должен содержать в себе только латинские буквы, цифры и знак подчеркивания");
        } else {
            System.out.println("------------------------------------------");
            System.out.println("Логин введен верно");
        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Слишком длинный пароль");
        } else if (!password.matches("\\w+")) {
            throw new WrongPasswordException("Пароль должен содержать в себе только латинские буквы, цифры и знак подчеркивания");
        } else {
            System.out.println("------------------------------------------");
            System.out.println("Пароль введен верно");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не равны");
        } else {
            System.out.println("------------------------------------------");
            System.out.println("Пароли равны");
        }
    }
}

