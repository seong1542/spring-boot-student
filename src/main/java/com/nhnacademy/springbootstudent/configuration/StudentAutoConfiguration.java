package com.nhnacademy.springbootstudent.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {StudentProperties.class, AccountProperties.class}) // studentproperties라는 놈을 빈으로 등록
public class StudentAutoConfiguration {
}
