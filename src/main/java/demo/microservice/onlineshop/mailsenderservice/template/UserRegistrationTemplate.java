package demo.microservice.onlineshop.mailsenderservice.template;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;

@Component
@Qualifier("UserRegistrationTemplate")
public class UserRegistrationTemplate extends MailTemplate{

    public UserRegistrationTemplate(Context context){
        super(context);
    }

    @Override
    public String getTemplate() {
        return "UserRegistrationEmailTemplate";
    }

}
