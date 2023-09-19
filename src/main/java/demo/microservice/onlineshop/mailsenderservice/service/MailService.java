package demo.microservice.onlineshop.mailsenderservice.service;

import demo.microservice.onlineshop.mailsenderservice.template.MailTemplate;

public interface MailService {
    void sendEmail(String email, String subject, MailTemplate template);
}
