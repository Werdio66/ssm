package com._520.ssm.controller;

import com._520.ssm.domain.User;
import com._520.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test1(Model model){
        System.out.println("test视图层");
        List<User> users = userService.listAll();
        System.out.println("--------" + users);
        model.addAttribute("users", users);
        return "forward:/views/list.jsp";
    }
}
