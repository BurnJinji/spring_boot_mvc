package com.burning8393.spring_boot_mvc.service;

import com.burning8393.spring_boot_mvc.RespStat;
import com.burning8393.spring_boot_mvc.dao.AccountReposity;
import com.burning8393.spring_boot_mvc.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    AccountReposity accountReposity;

    public RespStat save(Account account) {
        try {
            Account entity = accountReposity.save(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return RespStat.build(200);
    }

    public List<Account> findAll() {
        return accountReposity.findByIdBetween(1, 6);
    }

    public Optional<Account> findById(int id) {
        return accountReposity.findById(id);
    }

    public List<Account> findxx() {
        return accountReposity.findxxx();
    }


}
