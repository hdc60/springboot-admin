package com.caihd.springbootadmin.cofig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "client.notify.mail")
public class EmailConfig {
    private String from;
    private String to;
    private String subject;
}
