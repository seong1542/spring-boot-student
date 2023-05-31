package com.nhnacademy.springbootstudent.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class MyHealthIndicator implements HealthIndicator {
    private final AtomicBoolean health = new AtomicBoolean(true);
    @Override
    public Health health(){
        if(!health.get()){
            return Health.down().build();
        }
        return Health.up().build();
    }

    public Health downHealth(){
        return Health.down().build();
    }

    public Health upHealth(){
        return Health.up().build();
    }
}
