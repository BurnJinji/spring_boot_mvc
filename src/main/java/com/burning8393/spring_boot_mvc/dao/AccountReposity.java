package com.burning8393.spring_boot_mvc.dao;

import com.burning8393.spring_boot_mvc.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountReposity extends JpaRepository<Account, Integer> {

    List<Account> findByIdBetween(int max, int min);

    Account findByLoginNameAndPassword(String loginName, String password);

    @Query("select acc from Account acc where acc.id = 1")
    List<Account> findxxx();

    @Query("select acc from Account acc where acc.id = ?1")
    List<Account> findbyxx(int id);
}
