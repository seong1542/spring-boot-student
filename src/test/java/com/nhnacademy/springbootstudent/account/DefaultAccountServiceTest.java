package com.nhnacademy.springbootstudent.account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestPropertySource(value = "classpath:testApplication.properties")
class DefaultAccountServiceTest {
//    @Autowired
//    AccountService accountService;
//
//    @Test
//    void getAccounts() {
//        List<Account> accounts = accountService.getAccounts();
//        assertEquals(2, accounts.size());
//    }

    @Autowired
    AccountReposiotry accountReposiotry;

    @Test
    void getAccountRepository(){
        Account myAccount = new Account("21213111", 2000);
        accountReposiotry.save(myAccount);
        Optional<Account> account = accountReposiotry.findById("21213111");

        assertThat(account).isPresent();
        assertThat(account.get().getBalance()).isEqualTo(2000);
    }
}