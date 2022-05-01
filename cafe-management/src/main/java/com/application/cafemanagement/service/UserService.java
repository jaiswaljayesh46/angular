package com.application.cafemanagement.service;

import com.application.cafemanagement.constants.Constants;
import com.application.cafemanagement.model.User;
import com.application.cafemanagement.repository.UserRepository;
import com.application.cafemanagement.utils.EmailUtils;
import com.application.cafemanagement.wrapper.UserWrapper;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmailUtils emailUtils;

    public String signUp(User user){
        try{
            if(vaidateMap(user)){
                User dbUser = userRepository.findByEmail(user.getEmail());
                if(Objects.isNull(dbUser)){
                    userRepository.save(user);
                    return Constants.SUCCESSFULLY_REGISTRED;
                }else{
                    return Constants.EMAIL_ID_ALREADY_EXISTS;
                }
            }else{
                return Constants.INVALID_DATA;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return Constants.SOMETHING_WENT_WRONG;
    }

    public String login(Map<String,String> requestMap){
        String email = requestMap.get("email");
        String password = requestMap.get("password");
        if(email != null && !email.isEmpty()){
           User user = userRepository.findByEmail(email);
           if(!Objects.isNull(user) && user.getPassword().equals(password)){
               return Constants.SUCCESSFULLY_LOGIN;
           }
        }
        throw new RuntimeException(Constants.INVALID_USER);
    }

    public String updateStatus(Map<String,String> requestMap){
        String status = requestMap.get("status");
        String id = requestMap.get("id");
        if(id != null && !id.isEmpty()){
            Optional<User> user = userRepository.findById(Integer.parseInt(id));
            if(user.isPresent()){
                user.get().setStatus(status);
                userRepository.save(user.get());
                sendemailToAdmin(user.get(), userRepository.getAllAdmin());
                return Constants.SUCCESSFULLY_STATUS_UPDATED;
            }
        }
        throw new RuntimeException(Constants.INVALID_USER);
    }

    private void sendemailToAdmin(User user, List<String> allAdmin) {

        emailUtils.sendEmail(user.getEmail(),"Account Approved","User - "+user.getName()+"is approved and status is "+user.getStatus(),allAdmin);
    }

    public List<UserWrapper> getAllUser(){
        List<User> userList =  userRepository.findAll();
        return userList.stream().map(user -> new UserWrapper(user)).collect(Collectors.toList());
    }


    private boolean vaidateMap(User user){
        return (user.getName() != null && user.getContactNumber() != null
                && user.getEmail() != null && user.getPassword() != null);
    }
}
