package demo.microservice.onlineshop.mailsenderservice.template;

import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;

@Component(value = "GeneralTemplate")
public class GeneralTemplate extends MailTemplate{

    public GeneralTemplate(Context context) {
        super(context);
    }

    @Override
    public String getTemplate() {
        return "GENERAL TEMPLATE";
    }

}
