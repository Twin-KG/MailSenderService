package demo.microservice.onlineshop.mailsenderservice;

import demo.microservice.onlineshop.mailsenderservice.service.MailService;
import demo.microservice.onlineshop.mailsenderservice.template.MailTemplate;
import demo.microservice.onlineshop.mailsenderservice.template.MailTemplateFactory;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;

@Component
@AllArgsConstructor
public class MessageListener {

    private final MailService mailService;

    @RabbitListener(queues = QueueConfig.USER_REGISTER_ACCOUNT_QUEUE)
    public void userAccountRegisterListener(CustomMessage message) {
        String subject = "Registration Success!";

        Context context = new Context();
        context.setVariable("username", message.getUsername());
        MailTemplate mailTemplate = MailTemplateFactory.produceUserRegistrationTemplate(context);

        mailService.sendEmail(message.getEmail(), subject, mailTemplate);
    }
}
