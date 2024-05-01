package course2.lesson5_exceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        System.out.println(message);
    }
}
