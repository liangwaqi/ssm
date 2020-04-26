package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    private IUserService userService;

    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("users")
    public String toUser(Model model) {
        //userService.queryUserById()
        List<User> users = userService.queryUserByList();
        model.addAttribute("users",users);
        return "users";
    }

    @RequestMapping("deleteUserById")
    public String deleteUserById(@RequestParam("id")Long id) {
        //开始开发
        userService.deleteUserById(id);
        return "redirect:/user/users";
    }
}
