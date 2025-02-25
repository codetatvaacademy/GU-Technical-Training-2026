package com.sortingvisualizer.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SortingException.class)
    public ResponseEntity<String> handleSortingException(SortingException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
