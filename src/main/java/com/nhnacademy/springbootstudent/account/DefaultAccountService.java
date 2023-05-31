package com.nhnacademy.springbootstudent.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class DefaultAccountService implements AccountService {
    private final AccountReposiotry accountReposiotry;

    @Override
    public Account createAccount(Account account) {
        return null;
    }

    @Override
    public Account getAccount(String id) {
        return null;
    }

    @Override
    public void deleteAccount(String id) {

    }

    @Override
    public List<Account> getAccounts() {
        return accountReposiotry.findAll();
    }
}
