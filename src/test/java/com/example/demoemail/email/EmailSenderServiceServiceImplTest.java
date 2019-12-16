package com.example.demoemail.email;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSenderServiceServiceImplTest {

    @Autowired
    private EmailSenderServiceServiceImpl emailSenderImpl;

    @Test
    void sendEmail() throws InterruptedException {
        //given
        String to = "eekreew@gmail.com";
        String title = "asd";
        String content = "dasdasd";
        //when
        emailSenderImpl.sendEmail(to, title, content);
        emailSenderImpl.sendEmail(to, title, content);
        emailSenderImpl.sendEmail(to, title, content);
        emailSenderImpl.sendEmail(to, title, content);
    }

}
