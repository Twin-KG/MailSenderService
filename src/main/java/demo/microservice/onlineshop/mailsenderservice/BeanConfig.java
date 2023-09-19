package demo.microservice.onlineshop.mailsenderservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.context.Context;

@Configuration
public class BeanConfig {

    @Bean
    public Context context(){
        return new Context();
    }

}
