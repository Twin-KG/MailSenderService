package demo.microservice.onlineshop.mailsenderservice.service.impl;

import demo.microservice.onlineshop.mailsenderservice.service.MailService;
import demo.microservice.onlineshop.mailsenderservice.template.MailTemplate;
import demo.microservice.onlineshop.mailsenderservice.template.MailTemplateFactory;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
@AllArgsConstructor
public class MailServiceImpl implements MailService {

    private final JavaMailSender sender;
    private final TemplateEngine templateEngine;

    @Override
    public void sendEmail(String toEmail, String subject, MailTemplate template) {

        try {

            String senderMail = "zayarlinnaung.coder@gmail.com";

            MimeMessage message = sender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, "UTF-8");
            helper.setFrom(senderMail);
            helper.setTo(toEmail);
            helper.setSubject(subject);

            /* Convert to htmlContent */
            String htmlContent = templateEngine.process(template.getTemplate(), template.getContext());
            helper.setText(htmlContent, true);

            sender.send(message);

            System.out.println(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
