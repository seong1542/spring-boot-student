package com.nhnacademy.springbootstudent.account;

import com.nhnacademy.springbootstudent.actuator.CouterEndpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    private final CouterEndpoint endpoint;

    @GetMapping("/accounts")
    public List<Account> getAccounts(){
        endpoint.increment(1L);
        return accountService.getAccounts();
    }

}
