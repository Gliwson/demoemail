package com.example.demoemail.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Controller
public class EmailController {
    private final EmailSenderService emailSenderService;
    private final TemplateEngine templateEngine;

    @Autowired
    public EmailController(EmailSenderService emailSenderService,
                           TemplateEngine templateEngine){
        this.emailSenderService = emailSenderService;
        this.templateEngine = templateEngine;
    }
    @RequestMapping("/")
    public void send() {
        Context context = new Context();
        context.setVariable("header", "Blood App");
        context.setVariable("title", "Coś..........");
        context.setVariable("description", "Tutaj jakis opis...");
        String body = templateEngine.process("template", context);
        emailSenderService.sendEmail("eekreew@gmail.com", "Newsletter", body);
       // return ;
    }
}
