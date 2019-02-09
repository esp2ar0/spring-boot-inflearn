package com.esp2ar0.springbootsecurity;

import com.esp2ar0.springbootsecurity.account.Account;
import com.esp2ar0.springbootsecurity.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account changhwan = accountService.createAccount("changhwan", "1234");
        System.out.println("username : " + changhwan.getUsername() + " password : " + changhwan.getPassword());
    }
}
