package com.nhnacademy.springbootstudent.account;

import com.nhnacademy.springbootstudent.configuration.AccountProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AccountVersionController {
    @Autowired
    private AccountProperties accountProperties;
    @GetMapping("/system/version")
    public Map<String, String> getVersion(){
        return Map.of("version", accountProperties.getVersion());
    }
}
