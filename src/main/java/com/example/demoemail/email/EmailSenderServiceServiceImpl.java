package com.example.demoemail.email;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@Service
@Async
public class EmailSenderServiceServiceImpl implements EmailSenderService {


    private JavaMailSender javaMailSender;

    public EmailSenderServiceServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }


    @Override
    public void sendEmail(String to, String title, String content) {
        MimeMessage mail = javaMailSender.createMimeMessage();
        String[] dsaddsad = {"eekreew@gmail.com"};
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo(dsaddsad);
            helper.setReplyTo("eekreew@gmail.com");
            helper.setFrom("eekreew@gmail.com");
            helper.setSubject(title);
            helper.setText(content, true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mail);
    }
}
