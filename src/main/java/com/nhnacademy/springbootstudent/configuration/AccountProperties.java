package com.nhnacademy.springbootstudent.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@ConfigurationProperties(prefix = "com.nhn.account.system")
public class AccountProperties {
    private String version;

}
