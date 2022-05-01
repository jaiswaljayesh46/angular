package com.application.cafemanagement.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CommonUtils {

    private CommonUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String response, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"mesasge\":\""+ response +"\"}",httpStatus);
    }
}
