package demo.microservice.onlineshop.mailsenderservice.template;

import org.thymeleaf.context.Context;

public class MailTemplateFactory {

    public static MailTemplate produceUserRegistrationTemplate(Context context){
        return new UserRegistrationTemplate(context);
    }

    public static MailTemplate produceGeneralTemplate(Context context){
        return new GeneralTemplate(context);
    }
}
