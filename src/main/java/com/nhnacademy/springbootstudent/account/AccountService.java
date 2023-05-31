package com.nhnacademy.springbootstudent.account;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();
    Account createAccount(Account account);
    Account getAccount(String id);
    void deleteAccount(String id);
}
