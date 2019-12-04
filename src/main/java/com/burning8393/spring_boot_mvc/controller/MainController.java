package com.burning8393.spring_boot_mvc.controller;

import com.burning8393.spring_boot_mvc.RespStat;
import com.burning8393.spring_boot_mvc.entity.Account;
import com.burning8393.spring_boot_mvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    AccountService accountService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Account> all = accountService.findAll();
        model.addAttribute("list", all);
        return "list";
    }

    @GetMapping("register")
    public String register(Model map) {
        return "register";
    }

    @PostMapping("register")
    public String registerP(HttpServletRequest request, Account account) {
        RespStat save = accountService.save(account);
        request.setAttribute("stat", save);
        return "register";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }


}
