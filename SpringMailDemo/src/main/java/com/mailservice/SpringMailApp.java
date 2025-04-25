package com.mailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * Hello world!
 */
@SpringBootApplication
public class SpringMailApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringMailApp.class, args);
    }

    @Bean
    JavaMailSender mailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setUsername("ruqsana123begum@gmail.com");
        mailSender.setPassword("password generated in gmail");
        mailSender.setPort(587);

        Properties properties = new Properties();
        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.starttls.required", true);
        properties.put("mail.smtp.starttls.enabled", true);
        properties.put("mail.smtp.auth", true);

        mailSender.setJavaMailProperties(properties);

        return mailSender;
    }
}
