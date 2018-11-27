package com.example.gugubird.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * 发送邮件的service类
 */
@Service
public class EmailService {
    @Autowired
    JavaMailSender MailSender;
    public boolean sendSimpleEmail(String topic,String content,ArrayList<String> recepients)
    {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("24320162202894@stu.xmu.edu.cn");
            message.setSubject(topic);
            message.setText(content);
            for (int i = 0; i < recepients.size(); i++) {
                message.setTo(recepients.get(i));
                MailSender.send(message);
            }
        }catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
