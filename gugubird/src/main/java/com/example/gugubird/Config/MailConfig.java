package com.example.gugubird.Config;
/**
 * 发送邮件的配置类
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {
    @Value("${spring.mail.host}")
    String host;
    @Value("${spring.mail.username}")
    String username;
    @Value("${spring.mail.password}")
    String password;
    @Bean
    public JavaMailSenderImpl mailSenderConfig() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setDefaultEncoding("utf-8");
        //配置邮箱用户
        mailSender.setUsername(username);
        //配置邮箱密码
        mailSender.setPassword(password);
        //配置邮箱服务器，这里是为了发邮件，所以要配置的是支持smtp协议的邮箱服务器，可以在邮箱客户端寻找服务器地址信息
        mailSender.setHost(host);
        Properties javaMailProperties = new Properties();
        javaMailProperties.setProperty("mail.smtp.auth", "true");
        javaMailProperties.setProperty("mail.smtp.timeout", "25000");
        javaMailProperties.setProperty("mail.transport.protocol", "smtp");
        javaMailProperties.setProperty("mail.smtp.ssl.enable", "false");
        mailSender.setJavaMailProperties(javaMailProperties);

        return mailSender;
    }
}
