package com.example.demo.exception;

import com.example.demo.DTO.ExceptionDTO;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)  // 500
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ExceptionDTO handleInternalServerError() {
        return new ExceptionDTO("Error: smth went wrong!", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
