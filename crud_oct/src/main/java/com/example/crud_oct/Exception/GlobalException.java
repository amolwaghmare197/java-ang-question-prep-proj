package com.example.crud_oct.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(AccountNotFoundException.class)
    public ResponseEntity<Object> handleUsernotFound(){
        Map<String,String > m1 = new HashMap<>();
        m1.put("status","400");
        m1.put("message" , "user not found");

        return ResponseEntity.status(400).body(m1);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> handleException(Exception ex) {

        Map<String, String> map = new HashMap<>();

        map.put("message", ex.getMessage());

        return map;
    }
}
