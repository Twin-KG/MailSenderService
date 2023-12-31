package demo.microservice.onlineshop.mailsenderservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage {

    private String messageId;
    private String email;
    private String username;
    private Date accountCreatedDate;

}
