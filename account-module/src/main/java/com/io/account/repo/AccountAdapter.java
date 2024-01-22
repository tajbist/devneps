package com.io.account.repo;

import com.io.account.domain.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountAdapter {

    public List<Account> getAccounts(){
        List<Account> accounts = new ArrayList<>();
        Account account = new Account();
        account.setEmail("harry@gmail.com");
        account.setFirstName("Hary");
        account.setId("12212");
        account.setLastName("Porter");
        account.setPhone("6414515149");
        accounts.add(account);
        Account account1 = new Account();
        account1.setEmail("john@gmail.com");
        account1.setFirstName("John");
        account1.setId("12211");
        account1.setLastName("Peter");
        account1.setPhone("6414515149");
        accounts.add(account1);
        return accounts;
    }
}
