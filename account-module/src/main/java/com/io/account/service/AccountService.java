package com.io.account.service;

import com.io.account.domain.Account;
import com.io.account.repo.AccountAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountAdapter accountAdapter;

    public List<Account> getAccounts(){
        return accountAdapter.getAccounts();
    }

}
