package com.example.demoemail.email;

public interface EmailSenderService {

    void sendEmail(String to, String subject, String content);
}
