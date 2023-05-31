package com.nhnacademy.springbootstudent.actuator;

import io.micrometer.core.lang.Nullable;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.concurrent.atomic.AtomicLong;

@Component
@Endpoint(id = "counter") //얘도  빈이라서 가져다 쓸 수 있음.
public class CouterEndpoint {
    private final AtomicLong counter = new AtomicLong();

    @ReadOperation
    public Long read(){
        return counter.get();
    }

    @WriteOperation
    public Long increment(@Nullable Long delta){
        if(delta==null){
            return counter.incrementAndGet();
        }
        return counter.addAndGet(delta);
    }
    @DeleteOperation
    public Long reset(){
        counter.set(0);
        return counter.get();
    }
}
