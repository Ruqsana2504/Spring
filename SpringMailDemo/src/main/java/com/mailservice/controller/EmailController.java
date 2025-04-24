package com.mailservice.controller;

import com.mailservice.service.IEmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final IEmailService emailService;

    public EmailController(IEmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/sendMail")
    public String sendMail(@RequestParam String to, @RequestParam String[] cc, @RequestParam String subject, @RequestParam String body) {
        return emailService.sendMail(to, cc, subject, body);
    }

}
