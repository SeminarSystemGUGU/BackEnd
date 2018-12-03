package com.example.gugubird.Config;
/**
 *
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

        mailSender.setUsername(username);

        mailSender.setPassword(password);

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
