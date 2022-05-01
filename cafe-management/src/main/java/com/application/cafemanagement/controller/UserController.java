package com.application.cafemanagement.controller;

import com.application.cafemanagement.constants.Constants;
import com.application.cafemanagement.model.User;
import com.application.cafemanagement.service.UserService;
import com.application.cafemanagement.utils.CommonUtils;
import com.application.cafemanagement.wrapper.UserWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody(required = true) User user){
        ResponseEntity<String> responseEntity;
        try{
            return new ResponseEntity<>(userService.signUp(user),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }

        return CommonUtils.getResponseEntity(Constants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String,String> requestMap){
        try{
            return new ResponseEntity<String>(userService.login(requestMap),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return CommonUtils.getResponseEntity(Constants.INVALID_USER, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/update-status")
    public ResponseEntity<String> updateStatus(@RequestBody Map<String,String> requestMap){
        try{
            return new ResponseEntity<String>(userService.updateStatus(requestMap),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return CommonUtils.getResponseEntity(Constants.INVALID_USER, HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @GetMapping("/getAllUser")
    public ResponseEntity<List<UserWrapper>> getAllUser(){
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK) ;
    }
}
