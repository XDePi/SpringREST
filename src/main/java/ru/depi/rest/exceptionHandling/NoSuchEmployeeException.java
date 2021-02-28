package ru.depi.rest.exceptionHandling;

/**
 * @author DePi
 **/

public class NoSuchEmployeeException extends RuntimeException {

    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
