package com.application.cafemanagement.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;

@Service
public class EmailUtils {

    @Autowired
    JavaMailSender emailSender;

    public void sendEmail(String to,String subject, String text, List<String> list){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("jaiswaljayesh47@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        if(list != null && list.size()>0)
            message.setCc(getCcArray(list));
        emailSender.send(message);
    }

    private String[] getCcArray(List<String> list) {
        String cCArray[] = new String[list.size()];
        for(int i =0;i<list.size();i++){
            cCArray[i] = list.get(i);
        }
        return cCArray;
    }
}
