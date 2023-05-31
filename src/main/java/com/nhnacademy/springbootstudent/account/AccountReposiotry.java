package com.nhnacademy.springbootstudent.account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountReposiotry extends JpaRepository<Account, String> {
}
