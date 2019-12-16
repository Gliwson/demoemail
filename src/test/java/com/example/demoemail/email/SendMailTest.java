package com.example.demoemail.email;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import javax.mail.MessagingException;

import static org.junit.jupiter.api.Assertions.*;

class SendMailTest {

    @Test
    void main() throws MessagingException {
        new SendMail().send();
    }

    @Test
    void send() {

    }
}
