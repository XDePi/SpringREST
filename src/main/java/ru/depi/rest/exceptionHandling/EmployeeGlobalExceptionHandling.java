package ru.depi.rest.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author DePi
 **/
@ControllerAdvice
public class EmployeeGlobalExceptionHandling {

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException
            (NoSuchEmployeeException noSuchEmployeeException) {
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(noSuchEmployeeException.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException
            (Exception exception) {
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
}
